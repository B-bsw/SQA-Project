package org.apache.commons.lang.text;

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
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        boolean boolean6 = extendedMessageFormat3.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (byte) 0 };
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat3.format(objArray7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0]");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat3.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.text.Format[] formatArray22 = new java.text.Format[] { extendedMessageFormat10, extendedMessageFormat15, extendedMessageFormat20 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat3.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.Object obj8 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat3.format((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) (byte) 100, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        boolean boolean5 = extendedMessageFormat3.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale14 = null;
        extendedMessageFormat12.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat12.setLocale(locale16);
        java.util.Locale locale18 = null;
        extendedMessageFormat12.setLocale(locale18);
        boolean boolean20 = extendedMessageFormat3.equals((java.lang.Object) locale18);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str10 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat3.format((java.lang.Object[]) formatArray9, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str15 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat3.format((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedMessageFormat2.format((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        extendedMessageFormat8.setLocale(locale10);
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = new java.text.Format[] { extendedMessageFormat8, extendedMessageFormat15 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.Object obj3 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat3.format((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = extendedMessageFormat2.format((java.lang.Object) "", stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat1.format((java.lang.Object[]) formatArray6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat1.format((java.lang.Object[]) formatArray6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        extendedMessageFormat7.setLocale(locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat7.setLocale(locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat7.setLocale(locale13);
        java.lang.Object[] objArray16 = extendedMessageFormat7.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat11.setLocale(locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat11.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object[]) formatArray19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.lang.Class<?> wildcardClass2 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        boolean boolean17 = extendedMessageFormat3.equals((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((-1), (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat3.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class [Ljava.lang.Object; (java.lang.Boolean and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat10.setLocale(locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat3.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        boolean boolean11 = extendedMessageFormat3.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat3.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        boolean boolean13 = extendedMessageFormat3.equals((java.lang.Object) formatArray12);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat3.parseObject("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat5, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        extendedMessageFormat7.applyPattern("");
        boolean boolean11 = extendedMessageFormat1.equals((java.lang.Object) extendedMessageFormat7);
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat3.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale14 = null;
        extendedMessageFormat12.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat12.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat(100, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.text.Format format3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) '#', format3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.lang.String str16 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = extendedMessageFormat3.format((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat3.setLocale(locale11);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat3.parseObject("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat3.format((java.lang.Object[]) formatArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.lang.Object obj7 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat3.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("");
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat1.format((java.lang.Object) str12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        extendedMessageFormat10.applyPattern("");
        java.lang.String str14 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat11.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) '4', (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = extendedMessageFormat2.format((java.lang.Object) 0.0d, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale14 = null;
        extendedMessageFormat12.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat12.setLocale(locale16);
        java.util.Locale locale18 = null;
        extendedMessageFormat12.setLocale(locale18);
        java.util.Locale locale20 = null;
        extendedMessageFormat12.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale17 = null;
        extendedMessageFormat15.setLocale(locale17);
        java.util.Locale locale19 = null;
        extendedMessageFormat15.setLocale(locale19);
        java.util.Locale locale21 = null;
        extendedMessageFormat15.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str24 = extendedMessageFormat15.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat3.parse("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat3.format((java.lang.Object) 0.0f, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.lang.Object[] objArray18 = extendedMessageFormat15.parse("hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat3.format(objArray18, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Class<?> wildcardClass3 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("", objArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 100, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat2.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale4 = null;
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat4.format((java.lang.Object[]) formatArray8, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat2.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.util.Locale locale6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) 1, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.lang.Object obj13 = extendedMessageFormat12.clone();
        boolean boolean14 = extendedMessageFormat3.equals(obj13);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.lang.Object obj9 = extendedMessageFormat8.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
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
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale14 = null;
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.lang.Object[] objArray19 = extendedMessageFormat16.parse("hi!");
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat16, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat8.format((java.lang.Object) ' ', stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormatsByArgumentIndex();
        boolean boolean9 = extendedMessageFormat2.equals((java.lang.Object) formatArray8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.util.Locale locale8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Class<?> wildcardClass11 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("");
        java.lang.String str16 = extendedMessageFormat9.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        boolean boolean7 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat6);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map15);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat3.format((java.lang.Object) "", stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        boolean boolean11 = extendedMessageFormat3.equals((java.lang.Object) locale10);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.util.Locale locale12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat3.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat3.parse("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        java.lang.Object obj3 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.lang.Object obj13 = extendedMessageFormat10.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedMessageFormat3.format(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedMessageFormat1.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class [Ljava.lang.Object; (java.lang.Boolean and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("");
        extendedMessageFormat11.applyPattern("");
        java.lang.String str18 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4);
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat7.format((java.lang.Object) 10.0d, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = new java.text.Format[] { extendedMessageFormat4, extendedMessageFormat9 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        java.util.Locale locale19 = null;
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.text.Format[] formatArray22 = extendedMessageFormat21.getFormats();
        java.lang.Object[] objArray24 = extendedMessageFormat21.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.Object obj8 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.lang.Object obj7 = extendedMessageFormat3.clone();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale17);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        extendedMessageFormat19.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat(10, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 1, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat3.format((java.lang.Object) locale11, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat7.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat3.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat3.parseObject("hi!", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat11.format((java.lang.Object) extendedMessageFormat13, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat1.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = null;
        extendedMessageFormat13.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        java.util.Locale locale19 = null;
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.text.Format[] formatArray22 = extendedMessageFormat21.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat13.formatToCharacterIterator((java.lang.Object) formatArray22);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat3.format((java.lang.Object[]) formatArray22, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat8.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray10);
        java.lang.Class<?> wildcardClass12 = attributedCharacterIterator11.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale8 = null;
        extendedMessageFormat7.setLocale(locale8);
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.Object[] objArray13 = extendedMessageFormat7.parse("hi!");
        boolean boolean14 = extendedMessageFormat3.equals((java.lang.Object) objArray13);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        extendedMessageFormat9.setLocale(locale11);
        java.util.Locale locale13 = null;
        extendedMessageFormat9.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat9.setLocale(locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat9.setLocale(locale17);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat9, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        boolean boolean5 = extendedMessageFormat1.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.util.Locale locale15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormats();
        java.lang.String str19 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        extendedMessageFormat7.applyPattern("hi!");
        boolean boolean12 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat3.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat3.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object obj4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = extendedMessageFormat1.format(obj4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat11.formatToCharacterIterator((java.lang.Object) formatArray18);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object) attributedCharacterIterator19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.text.AttributedString$AttributedStringIterator cannot be cast to class [Ljava.lang.Object; (java.text.AttributedString$AttributedStringIterator and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.lang.Object obj9 = extendedMessageFormat6.clone();
        boolean boolean10 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat3.format((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.lang.Object obj12 = extendedMessageFormat11.clone();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        boolean boolean17 = extendedMessageFormat3.equals((java.lang.Object) extendedMessageFormat15);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat8.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map15);
        java.lang.Object[] objArray18 = extendedMessageFormat16.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) '4', (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat8.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat13.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat1.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat1.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat11.format((java.lang.Object) map18, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        extendedMessageFormat14.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = extendedMessageFormat14.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.lang.String str20 = extendedMessageFormat18.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormats();
        boolean boolean22 = extendedMessageFormat3.equals((java.lang.Object) extendedMessageFormat18);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat3.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        boolean boolean19 = extendedMessageFormat13.equals((java.lang.Object) extendedMessageFormat15);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat5.setLocale(locale15);
        extendedMessageFormat1.setLocale(locale15);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = extendedMessageFormat1.parse("", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat3.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        extendedMessageFormat3.applyPattern("");
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat3.parse("", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        extendedMessageFormat20.applyPattern("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat20.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat13.formatToCharacterIterator((java.lang.Object) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) ' ', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale16 = null;
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale20 = null;
        extendedMessageFormat18.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat1.format((java.lang.Object[]) formatArray12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat3.parseObject("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) formatArray12);
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormatsByArgumentIndex();
        boolean boolean15 = extendedMessageFormat1.equals((java.lang.Object) formatArray14);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat3.format((java.lang.Object[]) formatArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        boolean boolean5 = extendedMessageFormat1.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.lang.Object obj7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat3.format(obj7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        extendedMessageFormat7.applyPattern("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map18);
        extendedMessageFormat19.applyPattern("");
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat3.format((java.lang.Object[]) formatArray23, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        boolean boolean14 = extendedMessageFormat1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat14.getFormats();
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat10.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat7.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray10);
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map31);
        boolean boolean33 = extendedMessageFormat1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        extendedMessageFormat13.setLocale(locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat13.setLocale(locale17);
        java.util.Locale locale19 = null;
        extendedMessageFormat13.setLocale(locale19);
        java.text.Format[] formatArray21 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str22 = extendedMessageFormat13.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((-1), (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat2.setLocale(locale12);
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        extendedMessageFormat19.applyPattern("");
        java.util.Locale locale23 = extendedMessageFormat19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale23);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map14);
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator25 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat3.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale15 = null;
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormats();
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat17.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatsByArgumentIndex(formatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat3.parse("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray15);
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        java.lang.Object obj23 = extendedMessageFormat20.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        java.util.Locale locale7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.text.Format[] formatArray22 = extendedMessageFormat18.getFormats();
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat14.format((java.lang.Object) extendedMessageFormat18, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat3.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat8.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.lang.Object[] objArray9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat8.format(objArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat3.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) formatArray21);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat2.format((java.lang.Object[]) formatArray21, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat11.formatToCharacterIterator(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        extendedMessageFormat3.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = extendedMessageFormat3.format((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat3.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        extendedMessageFormat11.setLocale(locale13);
        java.util.Locale locale15 = null;
        extendedMessageFormat11.setLocale(locale15);
        java.util.Locale locale17 = null;
        extendedMessageFormat11.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat11.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat1.format((java.lang.Object[]) formatArray7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator10 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat3.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = extendedMessageFormat4.format((java.lang.Object) locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat7.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat11.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        extendedMessageFormat10.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat10.setLocale(locale14);
        java.util.Locale locale16 = null;
        extendedMessageFormat10.setLocale(locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormatsByArgumentIndex();
        boolean boolean19 = extendedMessageFormat4.equals((java.lang.Object) formatArray18);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat12.getLocale();
        java.lang.String str17 = extendedMessageFormat12.toPattern();
        boolean boolean18 = extendedMessageFormat3.equals((java.lang.Object) str17);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat10.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        extendedMessageFormat9.applyPattern("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        extendedMessageFormat17.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat8.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map17);
        java.lang.Class<?> wildcardClass19 = extendedMessageFormat18.getClass();
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        extendedMessageFormat8.applyPattern("");
        java.lang.String str12 = extendedMessageFormat8.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat11.setLocale(locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat11.getLocale();
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = extendedMessageFormat11.formatToCharacterIterator((java.lang.Object) formatArray20);
        extendedMessageFormat11.applyPattern("hi!");
        java.util.Locale locale24 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) 10, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
        org.junit.Assert.assertNull(locale24);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat14.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale6 = null;
        extendedMessageFormat5.setLocale(locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat5.getLocale();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) formatArray14);
        extendedMessageFormat5.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat3.parse("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat8.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat3.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat18, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.lang.Object obj15 = extendedMessageFormat13.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat11.formatToCharacterIterator(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        extendedMessageFormat14.setLocale(locale21);
        java.util.Locale locale26 = null;
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26, map27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator30 = extendedMessageFormat14.formatToCharacterIterator((java.lang.Object) extendedMessageFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat12.parse("hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat1.format(objArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat2.setLocale(locale12);
        java.lang.Class<?> wildcardClass15 = locale12.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        extendedMessageFormat10.applyPattern("");
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale9 = null;
        extendedMessageFormat8.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat8.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat3.parseObject("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = extendedMessageFormat14.parse("hi!", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat6.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat8.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (short) -1, (java.text.Format) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat7.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.Class<?> wildcardClass11 = extendedMessageFormat10.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormats();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format((java.lang.Object[]) formatArray6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat8.parseObject("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat3.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = extendedMessageFormat3.parseObject("hi!", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map20);
        extendedMessageFormat11.setLocale(locale19);
        java.util.Locale locale25 = null;
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25, map26);
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.text.Format[] formatArray29 = extendedMessageFormat27.getFormats();
        extendedMessageFormat27.applyPattern("");
        java.lang.String str32 = extendedMessageFormat27.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat((int) ' ', (java.text.Format) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray15);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat3.parseObject("", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormat(10, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat3.format(obj9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        boolean boolean15 = extendedMessageFormat3.equals((java.lang.Object) formatArray14);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Locale locale24 = null;
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        extendedMessageFormat26.applyPattern("");
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map32);
        extendedMessageFormat33.applyPattern("");
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map37);
        extendedMessageFormat26.setLocale(locale36);
        extendedMessageFormat21.setLocale(locale36);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map12);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map14);
        extendedMessageFormat3.setLocale(locale11);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat3.parseObject("", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat3.parse("hi!");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat9.formatToCharacterIterator((java.lang.Object) formatArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        extendedMessageFormat2.setLocale(locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) 10, (java.text.Format) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat3.format(obj9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        extendedMessageFormat7.applyPattern("");
        java.lang.Object obj13 = extendedMessageFormat7.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale16 = null;
        extendedMessageFormat15.setLocale(locale16);
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        java.util.Locale locale19 = extendedMessageFormat15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat(10, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        boolean boolean14 = extendedMessageFormat7.equals((java.lang.Object) formatArray13);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        extendedMessageFormat3.applyPattern("");
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat3.format((java.lang.Object) (short) 10, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = extendedMessageFormat14.parseObject("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        extendedMessageFormat3.applyPattern("");
        java.lang.Object obj6 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.Object obj9 = null;
        boolean boolean10 = extendedMessageFormat3.equals(obj9);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map9);
        extendedMessageFormat10.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map16);
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        extendedMessageFormat10.setLocale(locale20);
        java.text.Format[] formatArray23 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat10.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map10);
        java.util.Locale locale13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedMessageFormat11.format((java.lang.Object) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray12);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat3.formatToCharacterIterator(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        extendedMessageFormat4.setLocale(locale15);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map26);
        extendedMessageFormat27.applyPattern("");
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale30, map31);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30, map33);
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map36);
        java.lang.String str38 = extendedMessageFormat37.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        extendedMessageFormat3.applyPattern("");
        java.lang.String str10 = extendedMessageFormat3.toPattern();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("");
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map25);
        extendedMessageFormat14.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = extendedMessageFormat3.format((java.lang.Object) locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        java.lang.Object obj10 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat3.setLocale(locale11);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str23 = extendedMessageFormat19.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        extendedMessageFormat14.setLocale(locale21);
        java.text.Format[] formatArray25 = extendedMessageFormat14.getFormats();
        java.util.Locale locale27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        java.text.Format[] formatArray30 = extendedMessageFormat28.getFormats();
        java.text.Format[] formatArray31 = extendedMessageFormat28.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat14.setFormatsByArgumentIndex(formatArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        java.text.Format format10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormat((int) '#', format10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map6);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map17);
        extendedMessageFormat7.setLocale(locale15);
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = extendedMessageFormat7.parseObject("", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat10.parse("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex((int) (short) 10, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map20);
        extendedMessageFormat11.setLocale(locale19);
        java.lang.String str23 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = extendedMessageFormat11.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale15 = null;
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormats();
        extendedMessageFormat17.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat17.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormat((int) '4', (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormats();
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat3.format((java.lang.Object[]) formatArray23, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        extendedMessageFormat3.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map26);
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        java.util.Locale locale30 = null;
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30, map31);
        java.text.Format[] formatArray33 = extendedMessageFormat32.getFormats();
        extendedMessageFormat32.applyPattern("");
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map38);
        extendedMessageFormat39.applyPattern("");
        java.util.Locale locale42 = extendedMessageFormat39.getLocale();
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42, map43);
        extendedMessageFormat32.setLocale(locale42);
        extendedMessageFormat27.setLocale(locale42);
        java.text.Format[] formatArray47 = extendedMessageFormat27.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat5.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale5 = null;
        extendedMessageFormat4.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat1.format((java.lang.Object) "hi!", stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat3.format((java.lang.Object) locale15, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        java.util.Locale locale12 = null;
        extendedMessageFormat11.setLocale(locale12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = extendedMessageFormat11.formatToCharacterIterator((java.lang.Object) formatArray17);
        java.lang.String str19 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray17);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat1.format((java.lang.Object[]) formatArray17, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat9.applyPattern("hi!");
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map14);
        extendedMessageFormat15.applyPattern("");
        extendedMessageFormat15.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormat(10, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat7.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat11.parseObject("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.lang.String str14 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.lang.Object obj7 = extendedMessageFormat1.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map19);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map23);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map28);
        extendedMessageFormat20.setLocale(locale27);
        java.text.Format[] formatArray31 = extendedMessageFormat20.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map15);
        java.lang.Object obj17 = extendedMessageFormat16.clone();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat11.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat3.parse("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        extendedMessageFormat11.applyPattern("");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) 'a', (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        extendedMessageFormat3.applyPattern("");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        java.util.Locale locale12 = null;
        extendedMessageFormat11.setLocale(locale12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = extendedMessageFormat11.formatToCharacterIterator((java.lang.Object) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map16);
        extendedMessageFormat17.applyPattern("");
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map23);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25, map26);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25, map28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = extendedMessageFormat10.format((java.lang.Object) locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.text.Format[] formatArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormatsByArgumentIndex(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat7.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat6.setLocale(locale16);
        extendedMessageFormat2.setLocale(locale16);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map20);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map25);
        extendedMessageFormat26.applyPattern("");
        java.util.Locale locale29 = extendedMessageFormat26.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map32);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator34 = extendedMessageFormat21.formatToCharacterIterator((java.lang.Object) locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = extendedMessageFormat2.format((java.lang.Object) locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat8.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map19);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map23);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map28);
        extendedMessageFormat20.setLocale(locale27);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map31);
        extendedMessageFormat2.setLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray35 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("");
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map20);
        extendedMessageFormat9.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator23 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) formatArray10);
        extendedMessageFormat1.applyPattern("hi!");
        java.lang.Class<?> wildcardClass14 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat11.setLocale(locale12);
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormats(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale21 = null;
        extendedMessageFormat20.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat20.getLocale();
        java.util.Locale locale26 = null;
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26, map27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator30 = extendedMessageFormat20.formatToCharacterIterator((java.lang.Object) formatArray29);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer33 = extendedMessageFormat18.format((java.lang.Object[]) formatArray29, stringBuffer31, fieldPosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator30);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.util.Locale locale10 = extendedMessageFormat8.getLocale();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat8, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat3.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        extendedMessageFormat3.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = null;
        extendedMessageFormat13.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat3.format((java.lang.Object[]) formatArray16, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.lang.Class<?> wildcardClass11 = extendedMessageFormat10.getClass();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat6.setLocale(locale16);
        extendedMessageFormat2.setLocale(locale16);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map20);
        java.lang.Object obj22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat21.format(obj22, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat3.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat15.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        extendedMessageFormat10.applyPattern("hi!");
        java.util.Locale locale14 = null;
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat10.formatToCharacterIterator((java.lang.Object) formatArray19);
        boolean boolean21 = extendedMessageFormat3.equals((java.lang.Object) formatArray19);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        extendedMessageFormat3.setLocale(locale23);
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = extendedMessageFormat3.parse("", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator11);
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        extendedMessageFormat10.applyPattern("hi!");
        extendedMessageFormat10.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.lang.Class<?> wildcardClass12 = locale7.getClass();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map18);
        extendedMessageFormat19.applyPattern("");
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        extendedMessageFormat12.setLocale(locale22);
        extendedMessageFormat8.setLocale(locale22);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = extendedMessageFormat5.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map23);
        extendedMessageFormat12.setLocale(locale20);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map26);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat4.setFormat((int) '4', (java.text.Format) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat1.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.util.Locale locale25 = null;
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25, map26);
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormats();
        extendedMessageFormat27.applyPattern("");
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map33);
        extendedMessageFormat34.applyPattern("");
        java.util.Locale locale37 = extendedMessageFormat34.getLocale();
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale37, map38);
        extendedMessageFormat27.setLocale(locale37);
        extendedMessageFormat22.setLocale(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = extendedMessageFormat7.format((java.lang.Object) locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat11.getFormats();
        java.lang.String str15 = extendedMessageFormat11.toPattern();
        java.util.Locale locale16 = extendedMessageFormat11.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map17);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat8.format((java.lang.Object) "", stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale15 = null;
        extendedMessageFormat14.setLocale(locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale18 = extendedMessageFormat14.getLocale();
        java.util.Locale locale20 = null;
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map21);
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat14.formatToCharacterIterator((java.lang.Object) formatArray23);
        java.lang.String str25 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray23);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale3 = null;
        extendedMessageFormat2.setLocale(locale3);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) formatArray8);
        java.lang.Class<?> wildcardClass10 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat(0, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map13);
        extendedMessageFormat14.applyPattern("");
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = extendedMessageFormat8.format((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat8.format(obj9);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = extendedMessageFormat11.parseObject("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale17 = null;
        extendedMessageFormat15.setLocale(locale17);
        java.util.Locale locale19 = null;
        extendedMessageFormat15.setLocale(locale19);
        java.util.Locale locale21 = null;
        extendedMessageFormat15.setLocale(locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str24 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray23);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        extendedMessageFormat5.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat5.setLocale(locale9);
        java.util.Locale locale11 = null;
        extendedMessageFormat5.setLocale(locale11);
        java.lang.Object[] objArray14 = extendedMessageFormat5.parse("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat5.parse("hi!");
        java.lang.String str17 = java.text.MessageFormat.format("", objArray16);
        java.lang.String str18 = java.text.MessageFormat.format("", objArray16);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat3.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.util.Locale locale14 = null;
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat16.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28, map29);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map31);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28, map33);
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35);
        extendedMessageFormat16.setLocale(locale35);
        boolean boolean38 = extendedMessageFormat10.equals((java.lang.Object) extendedMessageFormat16);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat3.format(obj9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat3.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat8.parse("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map19);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map23);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map28);
        extendedMessageFormat20.setLocale(locale27);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map31);
        extendedMessageFormat2.setLocale(locale27);
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map36);
        extendedMessageFormat37.applyPattern("");
        java.util.Locale locale40 = extendedMessageFormat37.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale40);
        java.text.Format[] formatArray42 = extendedMessageFormat41.getFormatsByArgumentIndex();
        extendedMessageFormat41.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray42);
        org.junit.Assert.assertArrayEquals(formatArray42, new java.text.Format[] {});
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        extendedMessageFormat14.setLocale(locale21);
        java.text.Format[] formatArray25 = extendedMessageFormat14.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = extendedMessageFormat14.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map13);
        extendedMessageFormat3.setLocale(locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale22 = null;
        extendedMessageFormat20.setLocale(locale22);
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = extendedMessageFormat16.format((java.lang.Object) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map10);
        java.util.Locale locale15 = null;
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray18);
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray18);
        boolean boolean21 = extendedMessageFormat11.equals((java.lang.Object) formatArray18);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray19 = extendedMessageFormat15.getFormatsByArgumentIndex();
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat15, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map23);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) formatArray11);
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
        java.lang.Class<?> wildcardClass14 = formatArray11.getClass();
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat1.getLocale();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        extendedMessageFormat9.applyPattern("");
        extendedMessageFormat9.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        java.lang.Object obj13 = extendedMessageFormat12.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22, map23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = extendedMessageFormat3.format((java.lang.Object) locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = extendedMessageFormat15.parseObject("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        extendedMessageFormat12.setLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        extendedMessageFormat8.setLocale(locale10);
        java.util.Locale locale12 = null;
        extendedMessageFormat8.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat8.setLocale(locale14);
        java.lang.Object[] objArray17 = extendedMessageFormat8.parse("hi!");
        boolean boolean18 = extendedMessageFormat3.equals((java.lang.Object) extendedMessageFormat8);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Locale locale14 = null;
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat12.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormats();
        java.util.Locale locale9 = extendedMessageFormat3.getLocale();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat3.parseObject("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat6.setLocale(locale16);
        extendedMessageFormat2.setLocale(locale16);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map29);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map32);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat21.setFormatByArgumentIndex((int) (short) 1, (java.text.Format) extendedMessageFormat33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = extendedMessageFormat11.format((java.lang.Object) locale18, stringBuffer26, fieldPosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat3.getFormats();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale10 = null;
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.lang.Object[] objArray15 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat3.parse("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        extendedMessageFormat14.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map23);
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map28);
        extendedMessageFormat29.applyPattern("");
        java.util.Locale locale32 = extendedMessageFormat29.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale32, map34);
        extendedMessageFormat24.setLocale(locale32);
        java.util.Locale locale37 = extendedMessageFormat24.getLocale();
        boolean boolean38 = extendedMessageFormat14.equals((java.lang.Object) extendedMessageFormat24);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        boolean boolean18 = extendedMessageFormat3.equals((java.lang.Object) map16);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Locale locale4 = null;
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.lang.Object obj7 = extendedMessageFormat6.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat21.getFormats();
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        extendedMessageFormat18.setLocale(locale24);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        extendedMessageFormat14.setLocale(locale24);
        java.lang.Object obj28 = extendedMessageFormat14.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat3.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map9);
        java.util.Locale locale11 = null;
        extendedMessageFormat10.setLocale(locale11);
        java.util.Locale locale14 = null;
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormats(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat15.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray15 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat7.parse("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        extendedMessageFormat11.applyPattern("");
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map17);
        extendedMessageFormat18.applyPattern("");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map22);
        extendedMessageFormat11.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator25 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat14.formatToCharacterIterator((java.lang.Object) formatArray21);
        java.lang.String str23 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray21);
        java.lang.String str24 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray21);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatsByArgumentIndex(formatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat8.parse("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.lang.Object[] objArray23 = extendedMessageFormat20.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat15.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.Locale locale2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2);
        java.lang.Object[] objArray5 = extendedMessageFormat3.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map20);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map24);
        extendedMessageFormat25.applyPattern("");
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map29);
        extendedMessageFormat21.setLocale(locale28);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28, map32);
        extendedMessageFormat3.setLocale(locale28);
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28, map35);
        java.text.Format[] formatArray37 = extendedMessageFormat36.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale44 = extendedMessageFormat43.getLocale();
        java.util.Map map45 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat46 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale44, map45);
        java.util.Map map47 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat48 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale44, map47);
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale44, map49);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat51 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale44);
        java.lang.String str52 = extendedMessageFormat51.toPattern();
        java.text.Format[] formatArray53 = extendedMessageFormat51.getFormats();
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.FieldPosition fieldPosition55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer56 = extendedMessageFormat36.format((java.lang.Object[]) formatArray53, stringBuffer54, fieldPosition55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray37);
        org.junit.Assert.assertArrayEquals(formatArray37, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(formatArray53);
        org.junit.Assert.assertArrayEquals(formatArray53, new java.text.Format[] {});
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale10 = null;
        extendedMessageFormat8.setLocale(locale10);
        java.util.Locale locale12 = null;
        extendedMessageFormat8.setLocale(locale12);
        java.util.Locale locale14 = null;
        extendedMessageFormat8.setLocale(locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str17 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray19 = extendedMessageFormat8.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator20 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        boolean boolean15 = extendedMessageFormat3.equals((java.lang.Object) locale9);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.String str22 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray21);
        java.lang.Class<?> wildcardClass23 = formatArray21.getClass();
        boolean boolean24 = extendedMessageFormat13.equals((java.lang.Object) formatArray21);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray12);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.text.Format[] formatArray22 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.text.Format[] formatArray23 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.String str24 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray23);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3);
        extendedMessageFormat4.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        extendedMessageFormat12.applyPattern("");
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        extendedMessageFormat4.setLocale(locale15);
        java.text.Format[] formatArray21 = extendedMessageFormat4.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map27);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26, map29);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator32 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat1.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale10 = null;
        extendedMessageFormat9.setLocale(locale10);
        java.lang.String str12 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map16);
        java.lang.Object[] objArray19 = extendedMessageFormat17.parse("hi!");
        java.lang.String str20 = java.text.MessageFormat.format("", objArray19);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat2.format(objArray19, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4, map5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map23);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map25);
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        java.util.Locale locale29 = null;
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map30);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormats();
        extendedMessageFormat31.applyPattern("");
        java.util.Map map37 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat38 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map37);
        extendedMessageFormat38.applyPattern("");
        java.util.Locale locale41 = extendedMessageFormat38.getLocale();
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale41, map42);
        extendedMessageFormat31.setLocale(locale41);
        extendedMessageFormat26.setLocale(locale41);
        java.text.Format[] formatArray46 = extendedMessageFormat26.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat8.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray46);
        org.junit.Assert.assertArrayEquals(formatArray46, new java.text.Format[] {});
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = extendedMessageFormat15.parse("", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map19);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map23);
        extendedMessageFormat24.applyPattern("");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map28);
        extendedMessageFormat20.setLocale(locale27);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map31);
        extendedMessageFormat2.setLocale(locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale36 = null;
        extendedMessageFormat35.setLocale(locale36);
        java.lang.String str38 = extendedMessageFormat35.toPattern();
        java.text.Format[] formatArray39 = extendedMessageFormat35.getFormatsByArgumentIndex();
        java.lang.Object[] objArray41 = extendedMessageFormat35.parse("hi!");
        boolean boolean42 = extendedMessageFormat2.equals((java.lang.Object) objArray41);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(formatArray39);
        org.junit.Assert.assertArrayEquals(formatArray39, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Locale locale8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat6.format((java.lang.Object[]) formatArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.lang.Class<?> wildcardClass15 = extendedMessageFormat13.getClass();
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale17 = null;
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale21 = null;
        extendedMessageFormat19.setLocale(locale21);
        java.util.Locale locale23 = null;
        extendedMessageFormat19.setLocale(locale23);
        java.util.Locale locale25 = null;
        extendedMessageFormat19.setLocale(locale25);
        extendedMessageFormat19.applyPattern("");
        java.text.Format[] formatArray29 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.text.Format[] formatArray30 = extendedMessageFormat19.getFormats();
        boolean boolean31 = extendedMessageFormat14.equals((java.lang.Object) formatArray30);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat1.parse("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat1.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale12 = null;
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat8.formatToCharacterIterator((java.lang.Object) formatArray15);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat1.format((java.lang.Object) attributedCharacterIterator16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        extendedMessageFormat3.applyPattern("");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map13);
        extendedMessageFormat3.setLocale(locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat16.parse("hi!", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        extendedMessageFormat16.applyPattern("");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map20);
        extendedMessageFormat11.setLocale(locale19);
        java.lang.String str23 = extendedMessageFormat11.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale26 = null;
        extendedMessageFormat25.setLocale(locale26);
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray29 = extendedMessageFormat25.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = extendedMessageFormat11.format((java.lang.Object) extendedMessageFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        boolean boolean11 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = extendedMessageFormat11.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        extendedMessageFormat21.applyPattern("");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map25);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map30);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormatsByArgumentIndex();
        java.lang.String str33 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray32);
        boolean boolean34 = extendedMessageFormat11.equals((java.lang.Object) formatArray32);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        extendedMessageFormat8.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = extendedMessageFormat21.parseObject("", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.lang.Class<?> wildcardClass10 = formatArray9.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = extendedMessageFormat18.parse("", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = extendedMessageFormat3.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map11);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale17 = null;
        extendedMessageFormat16.setLocale(locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale7 = null;
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat3.formatToCharacterIterator((java.lang.Object) formatArray12);
        extendedMessageFormat3.applyPattern("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale19 = null;
        extendedMessageFormat18.setLocale(locale19);
        java.text.Format[] formatArray21 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        java.util.Locale locale24 = null;
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map25);
        java.text.Format[] formatArray27 = extendedMessageFormat26.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat18.formatToCharacterIterator((java.lang.Object) formatArray27);
        java.lang.String str29 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray27);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormatsByArgumentIndex(formatArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        extendedMessageFormat3.applyPattern("");
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        extendedMessageFormat3.setLocale(locale23);
        java.text.Format[] formatArray25 = extendedMessageFormat3.getFormats();
        java.lang.Class<?> wildcardClass26 = formatArray25.getClass();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map6);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map26);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map30);
        extendedMessageFormat31.applyPattern("");
        java.util.Locale locale34 = extendedMessageFormat31.getLocale();
        java.util.Map map35 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale34, map35);
        extendedMessageFormat27.setLocale(locale34);
        java.text.Format[] formatArray38 = extendedMessageFormat27.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat12.setFormats(formatArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat13.parseObject("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Locale locale3 = null;
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale3, map4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map16);
        extendedMessageFormat5.setLocale(locale13);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map21);
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray25 = extendedMessageFormat22.parse("", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        extendedMessageFormat2.setLocale(locale8);
        extendedMessageFormat2.applyPattern("");
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map14);
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map21);
        extendedMessageFormat22.applyPattern("");
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25);
        extendedMessageFormat15.setLocale(locale25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator29 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.lang.String str4 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormatsByArgumentIndex();
        java.lang.Object[] objArray7 = extendedMessageFormat1.parse("hi!");
        java.lang.String str8 = extendedMessageFormat1.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale12 = null;
        extendedMessageFormat11.setLocale(locale12);
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.Object[] objArray17 = extendedMessageFormat11.parse("hi!");
        java.lang.String str18 = java.text.MessageFormat.format("", objArray17);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat1.format(objArray17, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormats();
        java.lang.String str5 = extendedMessageFormat1.toPattern();
        java.util.Locale locale6 = extendedMessageFormat1.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        extendedMessageFormat7.applyPattern("");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map30);
        java.util.Locale locale32 = null;
        extendedMessageFormat31.setLocale(locale32);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat18.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        extendedMessageFormat8.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat2.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale20 = null;
        extendedMessageFormat19.setLocale(locale20);
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat19.getFormatsByArgumentIndex();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29, map32);
        extendedMessageFormat19.setLocale(locale29);
        extendedMessageFormat2.setLocale(locale29);
        java.util.Locale locale38 = null;
        java.util.Map map39 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale38, map39);
        extendedMessageFormat40.applyPattern("hi!");
        java.lang.String str43 = extendedMessageFormat40.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale48 = extendedMessageFormat47.getLocale();
        java.util.Map map49 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat50 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale48, map49);
        java.util.Map map51 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale48, map51);
        extendedMessageFormat40.setLocale(locale48);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 10, (java.text.Format) extendedMessageFormat40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = null;
        extendedMessageFormat1.setLocale(locale2);
        java.util.Locale locale4 = extendedMessageFormat1.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat1.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        extendedMessageFormat4.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12, map13);
        java.util.Locale locale16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.Object[] objArray19 = extendedMessageFormat17.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale27 = extendedMessageFormat26.getLocale();
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27, map28);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map30);
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27, map32);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map34);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map38);
        extendedMessageFormat39.applyPattern("");
        java.util.Locale locale42 = extendedMessageFormat39.getLocale();
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42, map43);
        extendedMessageFormat35.setLocale(locale42);
        java.util.Map map46 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale42, map46);
        extendedMessageFormat17.setLocale(locale42);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer51 = extendedMessageFormat14.format((java.lang.Object) extendedMessageFormat17, stringBuffer49, fieldPosition50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.util.Locale locale24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        java.lang.Object[] objArray27 = extendedMessageFormat25.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        java.util.Map map36 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale35, map36);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map38);
        java.util.Map map40 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale35, map40);
        java.util.Map map42 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale35, map42);
        java.util.Map map46 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat47 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map46);
        extendedMessageFormat47.applyPattern("");
        java.util.Locale locale50 = extendedMessageFormat47.getLocale();
        java.util.Map map51 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat52 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale50, map51);
        extendedMessageFormat43.setLocale(locale50);
        java.util.Map map54 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat55 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale50, map54);
        extendedMessageFormat25.setLocale(locale50);
        java.util.Map map57 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat58 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale50, map57);
        java.text.Format[] formatArray59 = extendedMessageFormat58.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator60 = extendedMessageFormat21.formatToCharacterIterator((java.lang.Object) formatArray59);
        java.lang.String str61 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray59);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray59);
        org.junit.Assert.assertArrayEquals(formatArray59, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormats();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat11.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale18 = null;
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.lang.Object[] objArray23 = extendedMessageFormat20.parse("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat20.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        extendedMessageFormat13.applyPattern("");
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map18);
        extendedMessageFormat8.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = extendedMessageFormat21.parse("", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat3.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map16);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat3.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = extendedMessageFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale5 = null;
        extendedMessageFormat3.setLocale(locale5);
        java.util.Locale locale7 = null;
        extendedMessageFormat3.setLocale(locale7);
        java.util.Locale locale9 = null;
        extendedMessageFormat3.setLocale(locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat3.parse("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat3.parse("hi!");
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map18);
        java.util.Locale locale20 = null;
        extendedMessageFormat19.setLocale(locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat23.getFormats();
        java.text.Format[] formatArray25 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = extendedMessageFormat19.formatToCharacterIterator((java.lang.Object) formatArray25);
        java.lang.String str27 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray25);
        java.lang.String str28 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray25);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat3.setFormats(formatArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale3, map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormats();
        java.lang.Object obj14 = extendedMessageFormat11.clone();
        boolean boolean15 = extendedMessageFormat5.equals(obj14);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

