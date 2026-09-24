package org.apache.commons.lang3.text;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.text.Format[] formatArray12 = new java.text.Format[] { extendedMessageFormat5, extendedMessageFormat8, extendedMessageFormat11 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray12);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.Format[] formatArray3 = new java.text.Format[] {};
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0L, '4', 1.0f, extendedMessageFormat8, 0L };
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format(objArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = null;
        extendedMessageFormat21.setLocale(locale24);
        java.text.Format[] formatArray26 = new java.text.Format[] { extendedMessageFormat9, extendedMessageFormat14, extendedMessageFormat21 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray26);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat5.setLocale(locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = new java.text.Format[] { extendedMessageFormat5, extendedMessageFormat12 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray15);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.Object obj5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = extendedMessageFormat2.format(obj5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) ' ', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat16.setLocale(locale17);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        java.lang.String str28 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray29 = new java.text.Format[] { extendedMessageFormat7, extendedMessageFormat12, extendedMessageFormat16, extendedMessageFormat21, extendedMessageFormat27 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray29);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format((java.lang.Object[]) formatArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str13 = java.text.MessageFormat.format("", objArray12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format(objArray12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = null;
        extendedMessageFormat6.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        boolean boolean8 = extendedMessageFormat2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class [Ljava.lang.Object; (java.lang.Integer and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format((java.lang.Object) 0, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class [Ljava.lang.Object; (java.lang.Integer and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = extendedMessageFormat2.format((java.lang.Object) 100L, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedMessageFormat2.format((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray11 = new java.text.Format[] { extendedMessageFormat6, extendedMessageFormat10 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat2.format((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str11 = java.text.MessageFormat.format("", objArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", objArray10);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale21);
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale25 = null;
        extendedMessageFormat22.setLocale(locale25);
        java.text.Format[] formatArray27 = extendedMessageFormat22.getFormats();
        java.lang.Object[] objArray28 = new java.lang.Object[] { str12, (byte) -1, formatArray18, 10.0d, extendedMessageFormat22 };
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = extendedMessageFormat2.format(objArray28, stringBuffer29, fieldPosition30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat2.format((java.lang.Object[]) formatArray11, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat2.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str14 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray13);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str14 = java.text.MessageFormat.format("", objArray13);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat2.format(objArray13, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat6.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat6.setLocale(locale9);
        boolean boolean11 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        java.util.Locale locale12 = null;
        extendedMessageFormat8.setLocale(locale12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format((java.lang.Object) locale12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str15 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray14);
        boolean boolean16 = extendedMessageFormat2.equals((java.lang.Object) formatArray14);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(100, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', format8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = extendedMessageFormat2.format((java.lang.Object) 1L, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.lang.Object obj15 = extendedMessageFormat10.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat2.formatToCharacterIterator(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.lang.Class<?> wildcardClass12 = extendedMessageFormat9.getClass();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object) wildcardClass12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator10 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format((java.lang.Object) (byte) 1, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format((java.lang.Object) (byte) 100, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.util.Locale locale9 = null;
        extendedMessageFormat6.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) '4', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.Object obj6 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(10, format8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = extendedMessageFormat2.format((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        boolean boolean3 = extendedMessageFormat1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        boolean boolean9 = extendedMessageFormat2.equals((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class [Ljava.lang.Object; (java.lang.Boolean and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat1.format((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat2.format((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat7, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.lang.String str18 = extendedMessageFormat10.format((java.lang.Object) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format((java.lang.Object[]) formatArray12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedMessageFormat1.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass6 = formatArray5.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.util.Locale locale16 = null;
        extendedMessageFormat10.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format((java.lang.Object) (-1), stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class [Ljava.lang.Object; (java.lang.Integer and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("");
        extendedMessageFormat10.applyPattern("");
        java.lang.Object obj18 = extendedMessageFormat10.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.String str15 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat1.format((java.lang.Object[]) formatArray14, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(locale18);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object) str12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat6.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str15 = java.text.MessageFormat.format("", objArray14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format(objArray14, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat2.format((java.lang.Object) "hi!", stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = null;
        extendedMessageFormat4.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormats();
        java.lang.String str10 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.lang.String str17 = extendedMessageFormat9.format((java.lang.Object) formatArray16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object[]) formatArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str15 = java.text.MessageFormat.format("", objArray14);
        java.lang.String str16 = java.text.MessageFormat.format("hi!", objArray14);
        boolean boolean17 = extendedMessageFormat2.equals((java.lang.Object) objArray14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = null;
        extendedMessageFormat4.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        boolean boolean14 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat(100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat1.format((java.lang.Object) 10.0f, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.lang.Object obj12 = extendedMessageFormat8.clone();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format(obj12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat2.format((java.lang.Object) true, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class [Ljava.lang.Object; (java.lang.Boolean and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format((java.lang.Object[]) formatArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.util.Locale locale15 = null;
        extendedMessageFormat9.setLocale(locale15);
        boolean boolean17 = extendedMessageFormat2.equals((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass6 = formatArray5.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat1.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.Class<?> wildcardClass15 = extendedMessageFormat9.getClass();
        boolean boolean16 = extendedMessageFormat2.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        boolean boolean15 = extendedMessageFormat2.equals((java.lang.Object) formatArray14);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj9 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat12.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) -1, (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj10 = extendedMessageFormat9.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.lang.Class<?> wildcardClass10 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray13 = extendedMessageFormat11.parse("hi!");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat1.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = null;
        extendedMessageFormat1.setLocale(locale3);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat12.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat12.setLocale(locale15);
        java.lang.Object obj17 = extendedMessageFormat12.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = extendedMessageFormat2.format(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.lang.String str20 = extendedMessageFormat14.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format((java.lang.Object[]) formatArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format((java.lang.Object) 0.0d, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = null;
        extendedMessageFormat8.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format format4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 1, format4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        boolean boolean8 = extendedMessageFormat1.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat9, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format((java.lang.Object) (-1.0d), stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.lang.Object obj11 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.lang.String str18 = extendedMessageFormat11.format((java.lang.Object) objArray17);
        java.util.Locale locale19 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.lang.String str11 = extendedMessageFormat4.format((java.lang.Object) objArray10);
        java.util.Locale locale12 = extendedMessageFormat4.getLocale();
        boolean boolean13 = extendedMessageFormat1.equals((java.lang.Object) locale12);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat2.format((java.lang.Object[]) formatArray17, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.lang.String str22 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray21);
        boolean boolean23 = extendedMessageFormat2.equals((java.lang.Object) formatArray21);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat2.format((java.lang.Object) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class [Ljava.lang.Object; (java.lang.Boolean and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat11, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat11.getFormatsByArgumentIndex();
        extendedMessageFormat11.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat2.format((java.lang.Object) formatArray11);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat2.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat1.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        extendedMessageFormat11.applyPattern("");
        extendedMessageFormat11.applyPattern("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat11.getFormats();
        java.util.Locale locale19 = extendedMessageFormat11.getLocale();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format((java.lang.Object) locale19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat6.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.lang.String str21 = extendedMessageFormat13.format((java.lang.Object) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat11.getFormatsByArgumentIndex();
        boolean boolean18 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat11);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray19);
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray19);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat2.format((java.lang.Object) formatArray19, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Object obj7 = null;
        boolean boolean8 = extendedMessageFormat2.equals(obj7);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object) formatArray12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat2.format((java.lang.Object) 10.0f, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray19 = extendedMessageFormat17.parse("hi!");
        java.lang.String str20 = extendedMessageFormat13.format((java.lang.Object) objArray19);
        java.text.Format[] formatArray21 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat13, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format((java.lang.Object) formatArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        extendedMessageFormat10.applyPattern("");
        extendedMessageFormat10.applyPattern("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat5.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat4.parse("hi!");
        java.util.Locale locale7 = null;
        extendedMessageFormat4.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 10, (java.text.Format) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat1.setLocale(locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format((java.lang.Object[]) formatArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.Object[] objArray16 = extendedMessageFormat9.parse("hi!");
        boolean boolean17 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format((java.lang.Object[]) formatArray8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Object obj8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format(obj8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        java.lang.Object obj16 = extendedMessageFormat11.clone();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat2.format(obj16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat12.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("");
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat12, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.String str18 = extendedMessageFormat12.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean9 = extendedMessageFormat1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale18 = null;
        extendedMessageFormat15.setLocale(locale18);
        java.util.Locale locale20 = null;
        extendedMessageFormat15.setLocale(locale20);
        java.util.Locale locale22 = null;
        extendedMessageFormat15.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) '4', (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        extendedMessageFormat11.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat14.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        boolean boolean19 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.Format format9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 10, format9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object obj11 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        java.lang.String str19 = extendedMessageFormat11.format((java.lang.Object) formatArray18);
        java.lang.String str20 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale11 = null;
        extendedMessageFormat8.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("hi!", objArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat8.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray20 = extendedMessageFormat18.parse("hi!");
        java.lang.String str21 = extendedMessageFormat14.format((java.lang.Object) objArray20);
        java.lang.String str22 = java.text.MessageFormat.format("", objArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat6.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat1.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.lang.Class<?> wildcardClass14 = extendedMessageFormat11.getClass();
        boolean boolean15 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat11);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        java.lang.String str18 = extendedMessageFormat10.format((java.lang.Object) formatArray17);
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.util.Locale locale15 = null;
        extendedMessageFormat11.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat11.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        extendedMessageFormat13.applyPattern("");
        extendedMessageFormat13.applyPattern("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        boolean boolean11 = extendedMessageFormat2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat12.setLocale(locale13);
        extendedMessageFormat12.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str13 = java.text.MessageFormat.format("", objArray12);
        java.lang.String str14 = java.text.MessageFormat.format("hi!", objArray12);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat1.format(objArray12, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale11 = null;
        extendedMessageFormat8.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat8.getFormats();
        boolean boolean14 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat8);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.lang.String str13 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat2.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.lang.Object obj15 = extendedMessageFormat10.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat2.formatToCharacterIterator(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.Object obj9 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass17 = formatArray16.getClass();
        boolean boolean18 = extendedMessageFormat1.equals((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(locale18);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat2.format((java.lang.Object[]) formatArray18, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        java.lang.String str17 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.String str15 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        java.lang.String str18 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format((java.lang.Object[]) formatArray19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        java.lang.Class<?> wildcardClass16 = formatArray14.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = null;
        extendedMessageFormat1.setLocale(locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = null;
        extendedMessageFormat14.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 10, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        boolean boolean12 = extendedMessageFormat2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray19);
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray19);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        java.lang.String str11 = extendedMessageFormat7.toPattern();
        java.util.Locale locale12 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        extendedMessageFormat13.applyPattern("hi!");
        extendedMessageFormat13.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator10 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.lang.Object obj11 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat13.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat13.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        java.util.Locale locale17 = null;
        extendedMessageFormat13.setLocale(locale17);
        java.lang.String str19 = extendedMessageFormat13.toPattern();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat10.format((java.lang.Object) str19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass12 = formatArray11.getClass();
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((-1), (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.util.Locale locale16 = extendedMessageFormat12.getLocale();
        java.util.Locale locale17 = extendedMessageFormat12.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(locale17);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat1.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.Object[] objArray25 = extendedMessageFormat15.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat15.setLocale(locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.text.Format[] formatArray27 = extendedMessageFormat23.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat15.formatToCharacterIterator((java.lang.Object) formatArray27);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat14.parse("hi!");
        java.lang.String str17 = extendedMessageFormat10.format((java.lang.Object) objArray16);
        java.util.Locale locale18 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat15.parse("hi!");
        java.lang.String str18 = extendedMessageFormat11.format((java.lang.Object) objArray17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat6.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormats();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat1.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat11.setLocale(locale16);
        java.util.Locale locale18 = null;
        extendedMessageFormat11.setLocale(locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat11, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat10.setLocale(locale15);
        extendedMessageFormat10.applyPattern("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat10.toPattern();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str16 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        java.lang.String str9 = extendedMessageFormat4.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat2.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat23.setLocale(locale35);
        extendedMessageFormat20.setLocale(locale35);
        extendedMessageFormat2.setLocale(locale35);
        java.lang.Object obj40 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat2.formatToCharacterIterator(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.lang.String str13 = extendedMessageFormat7.toPattern();
        java.util.Locale locale14 = null;
        extendedMessageFormat7.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat18.toPattern();
        java.lang.String str26 = extendedMessageFormat18.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat47.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat47.getFormats();
        java.lang.String str51 = extendedMessageFormat47.toPattern();
        java.util.Locale locale52 = extendedMessageFormat47.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale52);
        extendedMessageFormat40.setLocale(locale52);
        extendedMessageFormat37.setLocale(locale52);
        extendedMessageFormat18.setLocale(locale52);
        extendedMessageFormat11.setLocale(locale52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.lang.String str17 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormats();
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat1.format((java.lang.Object[]) formatArray18, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = null;
        extendedMessageFormat1.setLocale(locale3);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) 1, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.String str15 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedMessageFormat2.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat12.parse("hi!");
        java.util.Locale locale15 = null;
        extendedMessageFormat12.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat10.format((java.lang.Object[]) formatArray17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat18.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat10.formatToCharacterIterator((java.lang.Object) formatArray22);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator23);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale18 = null;
        extendedMessageFormat12.setLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        java.lang.String str15 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.lang.Class<?> wildcardClass11 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat15.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        java.util.Locale locale20 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        boolean boolean22 = extendedMessageFormat2.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.util.Locale locale9 = null;
        extendedMessageFormat6.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 100, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat10.setLocale(locale51);
        boolean boolean57 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat10);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        java.util.Locale locale16 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale20);
        extendedMessageFormat21.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormats();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat28.applyPattern("");
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormats();
        java.lang.String str32 = extendedMessageFormat28.toPattern();
        java.util.Locale locale33 = extendedMessageFormat28.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale33);
        extendedMessageFormat21.setLocale(locale33);
        extendedMessageFormat18.setLocale(locale33);
        boolean boolean37 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat18);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray24 = extendedMessageFormat22.parse("hi!");
        java.lang.String str25 = extendedMessageFormat18.format((java.lang.Object) objArray24);
        java.text.Format[] formatArray26 = extendedMessageFormat18.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        extendedMessageFormat18.setLocale(locale35);
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale40);
        extendedMessageFormat41.applyPattern("");
        java.text.Format[] formatArray44 = extendedMessageFormat41.getFormats();
        java.text.Format[] formatArray45 = extendedMessageFormat41.getFormats();
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale47);
        extendedMessageFormat48.applyPattern("");
        java.util.Locale locale51 = null;
        extendedMessageFormat48.setLocale(locale51);
        java.util.Locale locale53 = null;
        extendedMessageFormat48.setLocale(locale53);
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat57 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale56);
        extendedMessageFormat57.applyPattern("");
        java.text.Format[] formatArray60 = extendedMessageFormat57.getFormats();
        java.lang.String str61 = extendedMessageFormat57.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat64.applyPattern("");
        java.text.Format[] formatArray67 = extendedMessageFormat64.getFormats();
        java.lang.String str68 = extendedMessageFormat64.toPattern();
        java.util.Locale locale69 = extendedMessageFormat64.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat70 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale69);
        extendedMessageFormat57.setLocale(locale69);
        java.text.Format[] formatArray72 = new java.text.Format[] { extendedMessageFormat10, extendedMessageFormat18, extendedMessageFormat41, extendedMessageFormat48, extendedMessageFormat57 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray44);
        org.junit.Assert.assertArrayEquals(formatArray44, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray60);
        org.junit.Assert.assertArrayEquals(formatArray60, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(formatArray67);
        org.junit.Assert.assertArrayEquals(formatArray67, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray72);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        boolean boolean15 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str16 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        extendedMessageFormat9.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat2.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat13.setLocale(locale25);
        extendedMessageFormat10.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        extendedMessageFormat10.setLocale(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = extendedMessageFormat10.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat1.format((java.lang.Object) formatArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.String str6 = java.text.MessageFormat.format("", objArray5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat1.format(objArray5, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat2.setLocale(locale14);
        java.lang.Object obj17 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = extendedMessageFormat2.format(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class [Ljava.lang.Object; (java.lang.Object and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat13.setLocale(locale25);
        extendedMessageFormat10.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        extendedMessageFormat10.setLocale(locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat42.applyPattern("");
        java.text.Format[] formatArray45 = extendedMessageFormat42.getFormats();
        java.util.Locale locale46 = null;
        extendedMessageFormat42.setLocale(locale46);
        java.text.Format[] formatArray48 = extendedMessageFormat42.getFormatsByArgumentIndex();
        java.text.Format[] formatArray49 = extendedMessageFormat42.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormats(formatArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat18.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat10.formatToCharacterIterator((java.lang.Object) formatArray22);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator23);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale18);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.text.Format[] formatArray26 = extendedMessageFormat23.getFormats();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat23.setLocale(locale35);
        extendedMessageFormat20.setLocale(locale35);
        extendedMessageFormat2.setLocale(locale35);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.text.Format[] formatArray45 = extendedMessageFormat43.getFormatsByArgumentIndex();
        java.lang.String str46 = extendedMessageFormat43.toPattern();
        java.text.Format[] formatArray47 = extendedMessageFormat43.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNotNull(formatArray45);
        org.junit.Assert.assertArrayEquals(formatArray45, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("hi!", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale12 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.util.Locale locale20 = extendedMessageFormat14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale20);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        extendedMessageFormat1.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = null;
        extendedMessageFormat10.setLocale(locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        java.util.Locale locale17 = null;
        extendedMessageFormat10.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = null;
        extendedMessageFormat11.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        java.lang.String str17 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.lang.Object[] objArray15 = extendedMessageFormat12.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat12.formatToCharacterIterator((java.lang.Object) formatArray18);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format((java.lang.Object) formatArray18, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        java.lang.String str16 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format((java.lang.Object[]) formatArray19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormats();
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        java.util.Locale locale17 = null;
        extendedMessageFormat10.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat10.setLocale(locale51);
        extendedMessageFormat2.setLocale(locale51);
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat61 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale60);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat64 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale63);
        extendedMessageFormat64.applyPattern("");
        java.util.Locale locale67 = extendedMessageFormat64.getLocale();
        java.text.Format[] formatArray68 = extendedMessageFormat64.getFormats();
        java.lang.String str69 = extendedMessageFormat61.format((java.lang.Object) formatArray68);
        extendedMessageFormat61.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(100, (java.text.Format) extendedMessageFormat61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(formatArray68);
        org.junit.Assert.assertArrayEquals(formatArray68, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        extendedMessageFormat2.setLocale(locale14);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat2.parse("", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat15.setLocale(locale16);
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.String str20 = extendedMessageFormat15.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat13.setLocale(locale25);
        extendedMessageFormat10.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        extendedMessageFormat10.setLocale(locale37);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat44.applyPattern("");
        java.util.Locale locale47 = extendedMessageFormat44.getLocale();
        java.lang.String str48 = extendedMessageFormat44.toPattern();
        java.text.Format[] formatArray49 = extendedMessageFormat44.getFormats();
        java.lang.String str50 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray49);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = extendedMessageFormat10.format((java.lang.Object[]) formatArray49, stringBuffer51, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format((java.lang.Object) "", stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat2.setLocale(locale36);
        java.lang.String str41 = extendedMessageFormat2.toPattern();
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator45 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat2.format((java.lang.Object[]) formatArray11, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = null;
        extendedMessageFormat5.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormats();
        java.util.Locale locale11 = null;
        extendedMessageFormat7.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        java.util.Locale locale15 = null;
        extendedMessageFormat9.setLocale(locale15);
        java.lang.Class<?> wildcardClass17 = extendedMessageFormat9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator18 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = extendedMessageFormat10.format((java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj13 = null;
        java.lang.String str14 = extendedMessageFormat2.format(obj13);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormatsByArgumentIndex();
        extendedMessageFormat20.applyPattern("");
        extendedMessageFormat20.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Locale locale3 = null;
        extendedMessageFormat1.setLocale(locale3);
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        java.lang.String str16 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat9.getFormats();
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat2.parse("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.lang.String str12 = extendedMessageFormat5.format((java.lang.Object) objArray11);
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        extendedMessageFormat5.applyPattern("");
        java.lang.Object obj16 = extendedMessageFormat5.clone();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat1.format(obj16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("");
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str25 = extendedMessageFormat18.toPattern();
        java.lang.String str26 = extendedMessageFormat18.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale39);
        extendedMessageFormat40.applyPattern("");
        java.text.Format[] formatArray43 = extendedMessageFormat40.getFormats();
        java.lang.String str44 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat47.applyPattern("");
        java.text.Format[] formatArray50 = extendedMessageFormat47.getFormats();
        java.lang.String str51 = extendedMessageFormat47.toPattern();
        java.util.Locale locale52 = extendedMessageFormat47.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat53 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale52);
        extendedMessageFormat40.setLocale(locale52);
        extendedMessageFormat37.setLocale(locale52);
        extendedMessageFormat18.setLocale(locale52);
        extendedMessageFormat11.setLocale(locale52);
        extendedMessageFormat3.setLocale(locale52);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat59 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale52);
        java.text.ParsePosition parsePosition61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = extendedMessageFormat59.parseObject("", parsePosition61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray43);
        org.junit.Assert.assertArrayEquals(formatArray43, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(formatArray50);
        org.junit.Assert.assertArrayEquals(formatArray50, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat2.setLocale(locale36);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale42);
        extendedMessageFormat43.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray49 = extendedMessageFormat47.parse("hi!");
        java.lang.String str50 = extendedMessageFormat43.format((java.lang.Object) objArray49);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = extendedMessageFormat2.format(objArray49, stringBuffer51, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) formatArray9);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormats();
        java.lang.String str23 = extendedMessageFormat2.format((java.lang.Object) formatArray22);
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = extendedMessageFormat2.parseObject("", parsePosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = null;
        extendedMessageFormat12.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat12, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) ' ', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0.0d, (short) 10, 100.0d, "hi!" };
        java.lang.String str13 = java.text.MessageFormat.format("", objArray12);
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        boolean boolean15 = extendedMessageFormat2.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0, 10, 100.0, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        boolean boolean17 = extendedMessageFormat2.equals((java.lang.Object) formatArray16);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        java.lang.String str16 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormats();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        extendedMessageFormat18.setLocale(locale26);
        boolean boolean29 = extendedMessageFormat2.equals((java.lang.Object) locale26);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.util.Locale locale14 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.lang.String str19 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        java.lang.String str22 = extendedMessageFormat14.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.lang.String str17 = extendedMessageFormat9.format((java.lang.Object) formatArray16);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str20 = extendedMessageFormat9.toPattern();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.util.Locale locale26 = extendedMessageFormat23.getLocale();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.lang.String str28 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray29 = extendedMessageFormat23.getFormats();
        java.lang.String str30 = extendedMessageFormat9.format((java.lang.Object) formatArray29);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat13.parse("hi!");
        java.util.Locale locale16 = null;
        extendedMessageFormat13.setLocale(locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat13.getFormats();
        java.lang.Object[] objArray20 = extendedMessageFormat13.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat13.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = extendedMessageFormat2.format((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object[]) formatArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat18.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray24 = extendedMessageFormat22.parse("hi!");
        java.lang.String str25 = extendedMessageFormat18.format((java.lang.Object) objArray24);
        java.text.Format[] formatArray26 = extendedMessageFormat18.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat30.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat30.getFormats();
        java.lang.String str34 = extendedMessageFormat30.toPattern();
        java.util.Locale locale35 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale35);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale35);
        extendedMessageFormat18.setLocale(locale35);
        extendedMessageFormat10.setLocale(locale35);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer42 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10, stringBuffer40, fieldPosition41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormats();
        java.lang.String str8 = extendedMessageFormat4.toPattern();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat12.setFormatByArgumentIndex((int) (byte) 100, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        java.lang.String str18 = extendedMessageFormat14.toPattern();
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale23);
        extendedMessageFormat24.applyPattern("");
        java.text.Format[] formatArray27 = extendedMessageFormat24.getFormats();
        java.lang.String str28 = extendedMessageFormat24.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        java.util.Locale locale36 = extendedMessageFormat31.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale36);
        extendedMessageFormat24.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat2.setLocale(locale36);
        java.lang.String str41 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.Object[] objArray16 = extendedMessageFormat9.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat2.format((java.lang.Object[]) formatArray17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat2.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat2.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.util.Locale locale19 = null;
        extendedMessageFormat14.setLocale(locale19);
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.util.Locale locale10 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat2.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat17.getFormats();
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat17.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormat(10, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(locale24);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        extendedMessageFormat2.setLocale(locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale13);
        boolean boolean15 = extendedMessageFormat2.equals((java.lang.Object) locale13);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.lang.String str20 = extendedMessageFormat14.toPattern();
        java.util.Locale locale21 = null;
        extendedMessageFormat14.setLocale(locale21);
        boolean boolean23 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat14);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat6.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) objArray8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormats();
        java.lang.String str16 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        java.lang.String str19 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat12.getFormats();
        extendedMessageFormat12.applyPattern("");
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat2.format((java.lang.Object) "", stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str16 = extendedMessageFormat9.toPattern();
        java.lang.String str17 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat21.applyPattern("");
        java.text.Format[] formatArray24 = extendedMessageFormat21.getFormats();
        java.lang.String str25 = extendedMessageFormat21.toPattern();
        java.util.Locale locale26 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale26);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale26);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale30);
        extendedMessageFormat31.applyPattern("");
        java.text.Format[] formatArray34 = extendedMessageFormat31.getFormats();
        java.lang.String str35 = extendedMessageFormat31.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat38.applyPattern("");
        java.text.Format[] formatArray41 = extendedMessageFormat38.getFormats();
        java.lang.String str42 = extendedMessageFormat38.toPattern();
        java.util.Locale locale43 = extendedMessageFormat38.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale43);
        extendedMessageFormat31.setLocale(locale43);
        extendedMessageFormat28.setLocale(locale43);
        extendedMessageFormat9.setLocale(locale43);
        extendedMessageFormat2.setLocale(locale43);
        java.lang.Class<?> wildcardClass49 = locale43.getClass();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat10.getLocale();
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale16);
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("");
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat17.toPattern();
        java.lang.String str25 = extendedMessageFormat17.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat29.applyPattern("");
        java.text.Format[] formatArray32 = extendedMessageFormat29.getFormats();
        java.lang.String str33 = extendedMessageFormat29.toPattern();
        java.util.Locale locale34 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale34);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale34);
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale38);
        extendedMessageFormat39.applyPattern("");
        java.text.Format[] formatArray42 = extendedMessageFormat39.getFormats();
        java.lang.String str43 = extendedMessageFormat39.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat46.applyPattern("");
        java.text.Format[] formatArray49 = extendedMessageFormat46.getFormats();
        java.lang.String str50 = extendedMessageFormat46.toPattern();
        java.util.Locale locale51 = extendedMessageFormat46.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale51);
        extendedMessageFormat39.setLocale(locale51);
        extendedMessageFormat36.setLocale(locale51);
        extendedMessageFormat17.setLocale(locale51);
        extendedMessageFormat10.setLocale(locale51);
        extendedMessageFormat2.setLocale(locale51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray59 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(formatArray49);
        org.junit.Assert.assertArrayEquals(formatArray49, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        java.lang.String str18 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang3.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang3.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = locale6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        java.lang.String str17 = extendedMessageFormat9.format((java.lang.Object) formatArray16);
        extendedMessageFormat9.applyPattern("");
        java.lang.String str20 = extendedMessageFormat9.toPattern();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat23.applyPattern("");
        java.util.Locale locale26 = extendedMessageFormat23.getLocale();
        java.lang.String str27 = extendedMessageFormat23.toPattern();
        java.lang.String str28 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray29 = extendedMessageFormat23.getFormats();
        java.lang.String str30 = extendedMessageFormat9.format((java.lang.Object) formatArray29);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer33 = extendedMessageFormat2.format((java.lang.Object[]) formatArray29, stringBuffer31, fieldPosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object[] objArray6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format(objArray6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat9.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.lang.Object[] objArray16 = extendedMessageFormat9.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat9.getFormats();
        boolean boolean18 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = extendedMessageFormat1.parse("hi!");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat1.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = null;
        extendedMessageFormat2.setLocale(locale4);
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale7);
        extendedMessageFormat8.applyPattern("");
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = null;
        extendedMessageFormat7.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.lang.String str13 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str15 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        java.lang.String str17 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormats();
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale9);
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray14);
        java.lang.String str16 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat2.parseObject("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = null;
        boolean boolean7 = extendedMessageFormat2.equals(obj6);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = null;
        extendedMessageFormat2.setLocale(locale5);
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Locale locale11 = null;
        extendedMessageFormat9.setLocale(locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormatsByArgumentIndex();
        boolean boolean14 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass10 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale locale1 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = null;
        extendedMessageFormat14.setLocale(locale17);
        java.util.Locale locale19 = extendedMessageFormat14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray22 = extendedMessageFormat19.getFormats();
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale24);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale24);
        extendedMessageFormat11.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = extendedMessageFormat1.format((java.lang.Object) locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale12);
        extendedMessageFormat13.applyPattern("");
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormats();
        java.lang.String str17 = extendedMessageFormat13.toPattern();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat20.applyPattern("");
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormats();
        java.lang.String str24 = extendedMessageFormat20.toPattern();
        java.util.Locale locale25 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale25);
        extendedMessageFormat13.setLocale(locale25);
        extendedMessageFormat10.setLocale(locale25);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat32.applyPattern("");
        java.text.Format[] formatArray35 = extendedMessageFormat32.getFormats();
        java.lang.String str36 = extendedMessageFormat32.toPattern();
        java.util.Locale locale37 = extendedMessageFormat32.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale37);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale37);
        extendedMessageFormat10.setLocale(locale37);
        java.text.Format[] formatArray41 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat45 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale44);
        extendedMessageFormat45.applyPattern("");
        java.text.Format[] formatArray48 = extendedMessageFormat45.getFormatsByArgumentIndex();
        extendedMessageFormat45.applyPattern("");
        java.text.Format[] formatArray51 = extendedMessageFormat45.getFormatsByArgumentIndex();
        extendedMessageFormat45.applyPattern("hi!");
        java.lang.Object[] objArray55 = extendedMessageFormat45.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray41);
        org.junit.Assert.assertArrayEquals(formatArray41, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray51);
        org.junit.Assert.assertArrayEquals(formatArray51, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertArrayEquals(objArray55, new java.lang.Object[] {});
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale4 = null;
        extendedMessageFormat1.setLocale(locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        java.lang.String str7 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.lang.String str16 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.util.Locale locale18 = extendedMessageFormat12.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale18);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat1.applyPattern("");
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale5 = null;
        extendedMessageFormat1.setLocale(locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormats();
        java.lang.String str19 = extendedMessageFormat11.format((java.lang.Object) formatArray18);
        extendedMessageFormat11.applyPattern("");
        java.lang.Object obj22 = null;
        java.lang.String str23 = extendedMessageFormat11.format(obj22);
        extendedMessageFormat11.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!");
        extendedMessageFormat5.applyPattern("");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.util.Locale locale10 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale10);
        extendedMessageFormat2.setLocale(locale10);
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang3.text.ExtendedMessageFormat("hi!", locale10);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang3.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray20 = new java.text.Format[] { extendedMessageFormat16 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(formatArray20);
    }
}

