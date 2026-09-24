package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray14 = new float[] { 100.0f, 1.0f, 1, (short) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "1) test1001(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, 1.0f, 1.0f, 0.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test1002(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle7.appendSuper(stringBuffer10, "hi!");
        boolean boolean13 = toStringStyle7.isUseFieldNames();
// flaky "3) test1003(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) boolean13);
        java.lang.String str15 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test1003(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "1) test1003(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle7);
// flaky "1) test1003(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "1) test1003(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer4, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test1004(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ",", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test1005(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test1005(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "2) test1005(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSizeEndText("");
        toStringStyle5.setContentEnd("");
        toStringStyle5.setArrayContentDetail(false);
        toStringStyle5.setFieldSeparator("<null>");
        toStringStyle5.setUseIdentityHashCode(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer4, (java.lang.Object) toStringStyle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "6) test1006(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer2 = null;
        boolean[] booleanArray7 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer2, "<size=", booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test1007(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { false, false, false });
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseShortClassName(false);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "8) test1009(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle4.setFieldNameValueSeparator("hi!");
        boolean boolean8 = toStringStyle4.isFullDetail((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer3, (java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray24 = new boolean[] { true, false, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.SimpleToStringStyle", booleanArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "9) test1011(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { true, false, true, true, true, false });
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        int[] intArray10 = new int[] { '4', 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.SimpleToStringStyle", intArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "10) test1012(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test1012(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 52, 0, (-1) });
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        toStringStyle9.setArraySeparator("");
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle9.setSizeEndText("");
// flaky "11) test1013(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        java.lang.StringBuffer stringBuffer22 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap24 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendDetail(stringBuffer22, "", objMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test1013(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "3) test1013(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "2) test1013(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objMap24);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setUseClassName(false);
        toStringStyle7.setNullText("");
        toStringStyle7.setArrayContentDetail(true);
        toStringStyle7.setArraySeparator("");
        java.lang.String str16 = toStringStyle7.getFieldSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle7.appendSuper(stringBuffer17, "");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle7);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer6, (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray15 = new long[] { 100L, 0L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 100L, 0L, 97L });
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle2.setSummaryObjectStartText("hi!");
        boolean boolean6 = toStringStyle2.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle2.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer1, (java.lang.Object) boolean7);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray18 = new short[] { (byte) 1, (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", shortArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 1, (short) 10, (short) -1, (short) 10, (short) 100 });
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "12) test1018(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray10 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "<size=", charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "13) test1019(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ' });
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("[");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setArraySeparator("");
        java.lang.String str13 = toStringStyle10.getContentStart();
        boolean boolean14 = toStringStyle10.isDefaultFullDetail();
        toStringStyle10.setFieldSeparatorAtEnd(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "14) test1020(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "5) test1020(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "4) test1020(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
// flaky "3) test1020(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean9 = toStringStyle0.isUseClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray13 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<size=", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "15) test1021(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray14 = new float[] { (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<size=", floatArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "16) test1022(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "6) test1022(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setUseClassName(false);
        boolean boolean13 = toStringStyle10.isFieldSeparatorAtEnd();
        java.lang.String str14 = toStringStyle10.getArraySeparator();
        boolean boolean16 = toStringStyle10.isFullDetail((java.lang.Boolean) true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean18 = toStringStyle17.isFieldSeparatorAtStart();
        toStringStyle17.setDefaultFullDetail(true);
        boolean boolean21 = toStringStyle17.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle22.setFieldNameValueSeparator("hi!");
        java.lang.String str25 = toStringStyle22.getContentStart();
        toStringStyle22.setArrayContentDetail(false);
        boolean boolean29 = toStringStyle22.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle30.setSummaryObjectStartText("hi!");
        java.lang.String str33 = toStringStyle30.getArraySeparator();
        java.lang.String str34 = toStringStyle30.getContentEnd();
        boolean boolean35 = toStringStyle30.isDefaultFullDetail();
        boolean boolean36 = toStringStyle30.isDefaultFullDetail();
        toStringStyle30.setArrayStart("[");
        java.lang.Object[] objArray39 = new java.lang.Object[] { boolean16, toStringStyle17, toStringStyle22, "[" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", objArray39, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "17) test1023(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(toStringStyle22);
// flaky "7) test1023(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str25, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(toStringStyle30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "," + "'", str33, ",");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str34, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "18) test1024(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "19) test1025(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ",", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray13 = new float[] { 10.0f, 100.0f, 1L, 0L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "20) test1027(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 10.0f, 100.0f, 1.0f, 0.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setFieldNameValueSeparator("hi!");
        toStringStyle11.setUseFieldNames(true);
        toStringStyle11.setArraySeparator("");
        toStringStyle11.setSizeEndText("hi!");
        toStringStyle11.setArrayStart(">");
        toStringStyle11.setFieldNameValueSeparator("hi!");
        java.lang.Object[] objArray24 = new java.lang.Object[] { toStringStyle11 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", objArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test1028(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray10 = new float[] { '4', 10L, (byte) 1, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "{", floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 52.0f, 10.0f, 1.0f, 0.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { 1L, (-1L), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "}", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, (-1L), 0L });
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray20 = new float[] { (short) 0, (-1L), (byte) 0, 'a', 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "=", floatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
// flaky "22) test1034(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "8) test1034(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 0.0f, (-1.0f), 0.0f, 97.0f, 10.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray9 = new double[] { 0.0d, (-1.0f), 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "hi!", doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer10, obj11);
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer2, "<size=", (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.Class<?> wildcardClass7 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test1038(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle2.setSummaryObjectStartText("hi!");
        boolean boolean6 = toStringStyle2.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle2.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer1, (java.lang.Object) boolean7);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.SimpleToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer6, ">", (java.lang.Object) "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "24) test1040(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "]", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer8, "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "25) test1042(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray18 = new boolean[] { true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<", booleanArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "26) test1043(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { true, true, true });
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "27) test1044(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ",", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test1045(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer5, "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setFieldNameValueSeparator("hi!");
        boolean boolean20 = toStringStyle16.isFullDetail((java.lang.Boolean) true);
        toStringStyle16.setSummaryObjectStartText("<null>");
        toStringStyle16.setFieldNameValueSeparator("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "{", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart("=");
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray19 = new char[] { ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', '#', 'a' });
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer7, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray16 = new float[] { '#', (-1), (byte) 100, (byte) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 35.0f, (-1.0f), 100.0f, 0.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean15 = toStringStyle14.isFieldSeparatorAtStart();
        toStringStyle14.setDefaultFullDetail(true);
        boolean boolean18 = toStringStyle14.isArrayContentDetail();
        toStringStyle14.setFieldNameValueSeparator("[");
        boolean boolean21 = toStringStyle14.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ">", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "29) test1052(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray12 = new short[] { (short) 0, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "]", shortArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 0, (short) -1, (short) 100 });
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart(",");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray13 = new double[] { '#', 0, 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "}", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "30) test1054(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "31) test1055(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray10 = new float[] { (byte) 1, 0.0f, (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "}", floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, 0.0f, 1.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "32) test1057(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, true, true });
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray18 = new char[] { '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<", charArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "33) test1058(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "9) test1058(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '4', 'a' });
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (byte) 1, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "34) test1059(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 1, (short) 1, (short) 10 });
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectEndText("");
        java.lang.Class<?> wildcardClass14 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test1060(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray16 = new double[] { 100.0f, (byte) 100, 0, 10L, 1.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "=", doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 0.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.ShortPrefixToStringStyle", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "36) test1062(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, true, false, false });
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray17 = new long[] { ' ', ' ', 0L, '4', (-1L), 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "37) test1063(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
// flaky "10) test1063(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, 32L, 0L, 52L, (-1L), 100L });
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean10 = toStringStyle9.isFieldSeparatorAtEnd();
        java.lang.String str11 = toStringStyle9.getSummaryObjectEndText();
        boolean boolean12 = toStringStyle9.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer7, ",", (java.lang.Object) boolean12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "38) test1064(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray8 = new short[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "", shortArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 0 });
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "hi!", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer8, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "39) test1067(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "40) test1068(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSizeEndText("");
        toStringStyle6.setContentEnd("");
        toStringStyle6.setArrayContentDetail(false);
        java.lang.String str13 = toStringStyle6.getNullText();
        boolean boolean14 = toStringStyle6.isUseIdentityHashCode();
        boolean boolean16 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        java.lang.String str17 = toStringStyle6.getContentEnd();
        boolean boolean18 = toStringStyle6.isUseClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer5, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "41) test1069(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "11) test1069(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ">", byteArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ">", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { 0, (short) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "hi!", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "42) test1073(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L, 10L, 10L });
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "}", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "43) test1075(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "[", longArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        int[] intArray13 = new int[] { (byte) 1, (short) 0, (short) -1, '4', (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "]" + "'", str1, "]");
// flaky "44) test1077(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1, 0, (-1), 52, 100, 0 });
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray14 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "<null>");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "]", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "45) test1079(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ",", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "46) test1080(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseShortClassName(false);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "47) test1083(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray13 = new char[] { '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.ShortPrefixToStringStyle", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "48) test1084(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '#' });
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSizeEndText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray9 = new short[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "=", shortArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0, (short) 1 });
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "[", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "49) test1089(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "50) test1090(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "12) test1090(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ",", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "51) test1094(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "52) test1095(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "13) test1095(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("<null>");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.SimpleToStringStyle", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "53) test1098(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "14) test1098(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "5) test1098(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray16 = new double[] { 1.0d, (byte) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) str3);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "54) test1102(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<size=", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "55) test1103(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        toStringStyle9.setArraySeparator("");
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle9.setSizeEndText("");
// flaky "56) test1104(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        java.lang.StringBuffer stringBuffer22 = null;
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendSummary(stringBuffer22, ",", doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "15) test1104(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "6) test1104(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "}", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Object obj0 = null;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "=", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "57) test1108(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "58) test1109(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "16) test1109(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", floatArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSizeEndText("");
        toStringStyle6.setContentEnd("");
        toStringStyle6.setNullText(">");
        toStringStyle6.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle6.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.Object obj17 = null;
        toStringStyle6.appendIdentityHashCode(stringBuffer16, obj17);
        boolean boolean19 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setFieldSeparator(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ">", (java.lang.Object) ",", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "59) test1111(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "60) test1112(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "17) test1112(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "61) test1113(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "18) test1113(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "}", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", objArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "62) test1116(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        java.lang.String str16 = toStringStyle13.getArraySeparator();
        java.lang.String str17 = toStringStyle13.getContentEnd();
        toStringStyle13.setSizeStartText("hi!");
        java.lang.String str20 = toStringStyle13.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, ",", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "63) test1117(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "19) test1117(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str17, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer10, obj11);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "]", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) str8);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "64) test1120(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
// flaky "20) test1120(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSummaryObjectStartText("hi!");
        boolean boolean15 = toStringStyle11.isFullDetail((java.lang.Boolean) false);
        java.lang.String str16 = toStringStyle11.getArraySeparator();
        toStringStyle11.setArrayContentDetail(true);
        java.lang.String str19 = toStringStyle11.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, ",", (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "65) test1121(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "21) test1121(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, ",", 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("]");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray18 = new float[] { 0.0f, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 0.0f, 0.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "<null>", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "66) test1125(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, true, false, false });
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("hi!");
        java.lang.String str5 = toStringStyle2.getContentStart();
        toStringStyle2.setSummaryObjectStartText("");
        toStringStyle2.setUseClassName(true);
        toStringStyle2.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle2.setFieldSeparatorAtStart(true);
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) true);
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray21 = new short[] { (byte) 100, (byte) 1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "hi!", shortArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
// flaky "67) test1126(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 100, (short) 1, (short) 1, (short) 100 });
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray18 = new int[] { (byte) 100, 0, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", intArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 0, 0, 100 });
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "]", (java.lang.Object) 100.0d, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "68) test1128(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setArraySeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray14 = new double[] { ' ', 10L, '#', (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ",", doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d, 10.0d, 35.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray17 = new int[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "{", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test1132(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle12.appendSuper(stringBuffer15, "hi!");
        boolean boolean18 = toStringStyle12.isArrayContentDetail();
        boolean boolean19 = toStringStyle12.isFieldSeparatorAtStart();
        boolean boolean20 = toStringStyle12.isDefaultFullDetail();
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle12);
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle12.appendToString(stringBuffer22, "");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer11, (java.lang.Object) stringBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "70) test1133(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer2, ">", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray11 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "}", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray17 = new double[] { 0.0f, 'a', (-1), 100L, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, ">", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 97.0d, (-1.0d), 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray11 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test1137(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100 });
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray14 = new long[] { 1, 1L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "]", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "72) test1138(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L, 1L, 0L });
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setContentEnd("");
        toStringStyle11.setArrayContentDetail(false);
        java.lang.String str18 = toStringStyle11.getSummaryObjectStartText();
        java.lang.String str19 = toStringStyle11.getArrayStart();
        toStringStyle11.setContentStart("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle22.setSummaryObjectStartText("hi!");
        java.lang.String str25 = toStringStyle22.getArraySeparator();
        java.lang.String str26 = toStringStyle22.getContentEnd();
        toStringStyle22.setSizeStartText("hi!");
        java.lang.String str29 = toStringStyle22.getFieldNameValueSeparator();
        java.lang.String str30 = toStringStyle22.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setSizeEndText("");
        toStringStyle31.setContentEnd("");
        toStringStyle31.setArrayContentDetail(false);
        java.lang.String str38 = toStringStyle31.getNullText();
        boolean boolean39 = toStringStyle31.isUseIdentityHashCode();
        toStringStyle31.setArrayContentDetail(false);
        java.lang.String str42 = toStringStyle31.getSizeEndText();
        java.lang.String str43 = toStringStyle31.getContentStart();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (byte) 10, "hi!", toStringStyle22, toStringStyle31 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", objArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str19, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "73) test1139(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "=", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        boolean boolean5 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray9 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ">", byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1 });
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtStart();
        toStringStyle13.setDefaultFullDetail(true);
        boolean boolean17 = toStringStyle13.isFieldSeparatorAtStart();
        toStringStyle13.setSizeStartText("hi!");
        java.lang.String str20 = toStringStyle13.getContentStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "hi!", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<null>" + "'", str20, "<null>");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setArraySeparator("");
        java.lang.String str13 = toStringStyle10.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSummaryObjectStartText("hi!");
        java.lang.String str17 = toStringStyle14.getArraySeparator();
        java.lang.String str18 = toStringStyle14.getContentEnd();
        java.lang.String str19 = toStringStyle14.getSummaryObjectStartText();
        boolean boolean20 = toStringStyle14.isUseClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle21.setSummaryObjectStartText("hi!");
        java.lang.String str24 = toStringStyle21.getArraySeparator();
        java.lang.String str25 = toStringStyle21.getContentEnd();
        boolean boolean26 = toStringStyle21.isDefaultFullDetail();
        boolean boolean27 = toStringStyle21.isDefaultFullDetail();
        boolean boolean28 = toStringStyle21.isDefaultFullDetail();
        toStringStyle21.setFieldSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setSizeEndText("");
        toStringStyle31.setContentEnd("");
        toStringStyle31.setArrayContentDetail(false);
        java.lang.String str38 = toStringStyle31.getSummaryObjectStartText();
        java.lang.String str39 = toStringStyle31.getArrayStart();
        toStringStyle31.setContentStart("hi!");
        toStringStyle31.setContentEnd("]");
        java.lang.Object[] objArray44 = new java.lang.Object[] { toStringStyle10, toStringStyle14, "hi!", "]" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", objArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky "74) test1144(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
// flaky "22) test1144(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<null>" + "'", str39, "<null>");
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer4, ",", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "75) test1145(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ",", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str14 = toStringStyle13.getSummaryObjectStartText();
        toStringStyle13.setArrayStart("ToStringStyle.SimpleToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", (java.lang.Object) toStringStyle13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.SimpleToStringStyle", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "76) test1149(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer2 = null;
        char[] charArray4 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, ",", charArray4, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<", byteArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "77) test1153(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) '4');
// flaky "78) test1154(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        toStringStyle9.setArraySeparator("");
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle9.setSizeEndText("");
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        toStringStyle9.setSummaryObjectStartText("=");
        java.lang.StringBuffer stringBuffer24 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean27 = toStringStyle26.isFieldSeparatorAtStart();
        toStringStyle26.setDefaultFullDetail(true);
        boolean boolean30 = toStringStyle26.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendInternal(stringBuffer24, "hi!", (java.lang.Object) boolean30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.ShortPrefixToStringStyle", (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        toStringStyle9.setContentEnd(">");
        java.lang.String str14 = toStringStyle9.getFieldSeparator();
        boolean boolean15 = toStringStyle9.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer7, "]", (java.lang.Object) toStringStyle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "79) test1157(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "23) test1157(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 100, (byte) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "80) test1158(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "24) test1158(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 100, 10, 97 });
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.Class<?> wildcardClass4 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSizeEndText("");
        toStringStyle10.setContentEnd("");
        java.lang.String str15 = toStringStyle10.getSizeEndText();
        toStringStyle10.setFieldSeparator("");
        toStringStyle10.setUseFieldNames(true);
        java.lang.String str20 = toStringStyle10.getSizeStartText();
        toStringStyle10.setSizeStartText("hi!");
        toStringStyle10.setSizeEndText("=");
        java.lang.String str25 = toStringStyle10.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "81) test1161(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray8 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "", booleanArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { true });
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "<", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "]");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray12 = new float[] { 1.0f, '#', 100, '4', 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "]", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 1.0f, 35.0f, 100.0f, 52.0f, 100.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setSummaryObjectStartText("hi!");
        java.lang.String str15 = toStringStyle12.getArraySeparator();
        java.lang.String str16 = toStringStyle12.getContentEnd();
        boolean boolean17 = toStringStyle12.isDefaultFullDetail();
        boolean boolean18 = toStringStyle12.isDefaultFullDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle19.setSizeEndText("");
        toStringStyle19.setContentEnd("");
        java.lang.String str24 = toStringStyle19.getSizeEndText();
        toStringStyle19.setFieldSeparator("");
        toStringStyle19.setUseFieldNames(true);
        java.lang.String str29 = toStringStyle19.getSizeStartText();
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle31.setFieldNameValueSeparator("hi!");
        java.lang.String str34 = toStringStyle31.getContentStart();
        toStringStyle31.setArrayContentDetail(false);
        boolean boolean38 = toStringStyle31.isFullDetail((java.lang.Boolean) false);
        toStringStyle19.appendClassName(stringBuffer30, (java.lang.Object) toStringStyle31);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle40.setSummaryObjectStartText("hi!");
        java.lang.String str43 = toStringStyle40.getArraySeparator();
        java.lang.String str44 = toStringStyle40.getContentEnd();
        java.lang.String str45 = toStringStyle40.getSummaryObjectStartText();
        toStringStyle40.setUseFieldNames(false);
        toStringStyle40.setContentStart("=");
        java.lang.String str50 = toStringStyle40.getContentStart();
        java.lang.Object[] objArray51 = new java.lang.Object[] { boolean18, stringBuffer30, str50 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", objArray51, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{" + "'", str34, "{");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toStringStyle40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "=" + "'", str50, "=");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[false, null, =]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[false, null, =]");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) ",");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray10 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", booleanArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] { true });
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray13 = new char[] { '#', '#', '4', '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "[", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', '4', '#', ' ', '4' });
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSummaryObjectStartText("hi!");
        java.lang.String str18 = toStringStyle15.getArraySeparator();
        java.lang.String str19 = toStringStyle15.getContentEnd();
        boolean boolean20 = toStringStyle15.isDefaultFullDetail();
        boolean boolean21 = toStringStyle15.isDefaultFullDetail();
        boolean boolean22 = toStringStyle15.isDefaultFullDetail();
        toStringStyle15.setSizeStartText("]");
        boolean boolean25 = toStringStyle15.isFieldSeparatorAtEnd();
        java.lang.Object[] objArray26 = new java.lang.Object[] { toStringStyle15 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "=", objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer1, "ToStringStyle.SimpleToStringStyle", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSizeEndText("");
        toStringStyle14.setContentEnd("");
        toStringStyle14.setArrayContentDetail(false);
        java.lang.String str21 = toStringStyle14.getNullText();
        boolean boolean22 = toStringStyle14.isUseIdentityHashCode();
        toStringStyle14.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean25 = toStringStyle14.isUseFieldNames();
        java.lang.String str26 = toStringStyle14.getSizeEndText();
        toStringStyle14.setNullText("{");
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle14.appendToString(stringBuffer29, "]");
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.Object obj33 = null;
        toStringStyle14.appendClassName(stringBuffer32, obj33);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer12, "]", (java.lang.Object) stringBuffer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "82) test1173(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "=", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray15 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "83) test1176(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1 });
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray12 = new float[] { (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "84) test1178(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray19 = new char[] { ' ', 'a', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<null>", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', 'a', ' ', ' ', 'a' });
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        java.lang.StringBuffer stringBuffer4 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.SimpleToStringStyle", objMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "85) test1180(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objMap6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "86) test1182(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray8 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "}", byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test1183(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer10, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean8 = toStringStyle7.isUseShortClassName();
        boolean boolean9 = toStringStyle7.isUseIdentityHashCode();
        toStringStyle7.setNullText("]");
        toStringStyle7.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle7);
        java.lang.String str15 = toStringStyle7.getArrayEnd();
        toStringStyle7.setDefaultFullDetail(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer5, "<", (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "{", byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator(",");
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<null>", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray7 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true });
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { (byte) 0, (byte) -1, 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "{", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, (-1L), 97L, 0L });
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<null>", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "88) test1193(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        toStringStyle9.setArraySeparator("");
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle9.setSizeEndText("");
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "{", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray21 = new double[] { 1L, (-1), (short) 1, (-1), 0.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, ">", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "89) test1195(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "25) test1195(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "7) test1195(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 1.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer2 = null;
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer2, "hi!", charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<size=", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.String str11 = toStringStyle8.getContentStart();
        toStringStyle8.setSummaryObjectStartText("");
        toStringStyle8.setUseClassName(true);
        toStringStyle8.setNullText("[");
        toStringStyle8.setUseIdentityHashCode(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer6, ",", (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSizeEndText("");
        toStringStyle8.setContentEnd("");
        toStringStyle8.setNullText(">");
        toStringStyle8.setDefaultFullDetail(true);
        boolean boolean17 = toStringStyle8.isDefaultFullDetail();
        java.lang.String str18 = toStringStyle8.getArraySeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer6, "hi!", (java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "90) test1203(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
// flaky "26) test1203(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray14 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "]", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "91) test1205(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSummaryObjectStartText("hi!");
        java.lang.String str13 = toStringStyle10.getArraySeparator();
        java.lang.String str14 = toStringStyle10.getContentEnd();
        toStringStyle10.setSizeStartText("hi!");
        java.lang.String str17 = toStringStyle10.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "92) test1206(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "27) test1206(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", charArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray13 = new char[] { '4', '4', 'a', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', 'a', '#', 'a', '#' });
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray17 = new int[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray16 = new long[] { 'a', (short) 100, (short) 100, 0L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 97L, 100L, 100L, 0L, 1L });
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparator("]");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSizeEndText("");
        toStringStyle13.setContentEnd("");
        toStringStyle13.setArrayContentDetail(false);
        java.lang.String str20 = toStringStyle13.getNullText();
        boolean boolean21 = toStringStyle13.isUseIdentityHashCode();
        toStringStyle13.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean24 = toStringStyle13.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "]" + "'", str20, "]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.String str12 = toStringStyle0.getNullText();
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray18 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.ShortPrefixToStringStyle", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "93) test1213(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<" + "'", str8, "<");
// flaky "28) test1213(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
// flaky "8) test1213(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', ' ' });
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "94) test1214(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "29) test1214(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray16 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "[", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ' });
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle8.appendSuper(stringBuffer11, "hi!");
        boolean boolean14 = toStringStyle8.isUseFieldNames();
        toStringStyle8.setArrayStart("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "95) test1216(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "<null>", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
// flaky "96) test1217(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
// flaky "30) test1217(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSizeEndText("");
        java.lang.String str11 = toStringStyle8.getSizeEndText();
        boolean boolean12 = toStringStyle8.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer6, "]", (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setArrayEnd("]");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSummaryObjectStartText("hi!");
        java.lang.String str14 = toStringStyle11.getArraySeparator();
        java.lang.String str15 = toStringStyle11.getContentEnd();
        java.lang.String str16 = toStringStyle11.getSummaryObjectStartText();
        toStringStyle11.setUseFieldNames(false);
        toStringStyle11.setContentStart("=");
        java.lang.Object[] objArray21 = new java.lang.Object[] { "=" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<", objArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "97) test1219(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "31) test1219(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[=]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[=]");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray10 = new float[] { 1L, 0L, (short) 1, (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "<size=", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, 0.0f, 1.0f, 10.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "98) test1221(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.SimpleToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSummaryObjectStartText("hi!");
        boolean boolean14 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        boolean boolean15 = toStringStyle10.isFieldSeparatorAtStart();
        java.lang.Class<?> wildcardClass16 = toStringStyle10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "[", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "99) test1223(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray16 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "}", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "100) test1224(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "101) test1225(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray12 = new char[] { '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "=", charArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "102) test1226(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', 'a' });
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle7.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSummaryObjectStartText("hi!");
        java.lang.String str13 = toStringStyle10.getArraySeparator();
        java.lang.String str14 = toStringStyle10.getContentEnd();
        java.lang.String str15 = toStringStyle10.getSummaryObjectStartText();
        toStringStyle10.setUseFieldNames(false);
        toStringStyle10.setContentStart("=");
        toStringStyle10.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean23 = toStringStyle22.isFieldSeparatorAtEnd();
        java.lang.String str24 = toStringStyle22.getSummaryObjectEndText();
        boolean boolean25 = toStringStyle22.isArrayContentDetail();
        toStringStyle22.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str28 = toStringStyle22.getArrayStart();
        toStringStyle22.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer31 = null;
// flaky "103) test1227(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle22.appendToString(stringBuffer31, "<");
        java.lang.Object[] objArray34 = new java.lang.Object[] { toStringStyle7, false, "<" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", objArray34, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
// flaky "32) test1227(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str24, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str28, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "104) test1228(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "]", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray15 = new double[] { '#', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray10 = new double[] { 10.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<null>", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "105) test1232(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseShortClassName(false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test1234(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "33) test1234(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        toStringStyle9.setArraySeparator("");
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle9.setSizeEndText("");
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        toStringStyle9.setSummaryObjectStartText("=");
        java.lang.StringBuffer stringBuffer24 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle26.setSizeEndText("");
        toStringStyle26.setContentEnd("");
        toStringStyle26.setArrayContentDetail(false);
        java.lang.String str33 = toStringStyle26.getNullText();
        boolean boolean34 = toStringStyle26.isUseIdentityHashCode();
        toStringStyle26.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean37 = toStringStyle26.isUseFieldNames();
        java.lang.String str38 = toStringStyle26.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle39 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle39.setSummaryObjectStartText("hi!");
        toStringStyle39.setFieldSeparatorAtEnd(false);
        toStringStyle39.setUseIdentityHashCode(true);
        toStringStyle39.setSizeStartText(",");
        java.lang.String str48 = toStringStyle39.getSummaryObjectEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle49 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle49.setFieldNameValueSeparator("hi!");
        java.lang.String str52 = toStringStyle49.getContentStart();
        toStringStyle49.setSummaryObjectStartText("");
        toStringStyle49.setUseClassName(true);
        toStringStyle49.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle49.setFieldSeparatorAtStart(true);
        boolean boolean61 = toStringStyle49.isUseClassName();
        java.lang.Object[] objArray62 = new java.lang.Object[] { str38, str48, toStringStyle49 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendDetail(stringBuffer24, "<null>", objArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "107) test1235(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle26);
// flaky "34) test1235(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "," + "'", str33, ",");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(toStringStyle39);
// flaky "9) test1235(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[" + "'", str48, "[");
        org.junit.Assert.assertNotNull(toStringStyle49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{" + "'", str52, "{");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<size=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "108) test1236(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "109) test1238(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray13 = new double[] { 100.0f, (short) 1, (short) 10, 100.0d, (byte) 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, 10.0d, 100.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "110) test1240(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "35) test1240(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean18 = toStringStyle17.isFieldSeparatorAtEnd();
        toStringStyle17.setNullText(",");
        java.lang.String str21 = toStringStyle17.getSizeEndText();
        java.lang.String str22 = toStringStyle17.getFieldNameValueSeparator();
        toStringStyle17.setArrayEnd("=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer15, "hi!", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "111) test1241(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky "36) test1241(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray8 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.ShortPrefixToStringStyle", shortArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] {});
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray13 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", booleanArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "112) test1243(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, false, true });
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray14 = new int[] { (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "]", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "113) test1244(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1 });
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setArrayStart("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray19 = new int[] { 0, (-1), '4', 0, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "114) test1246(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
// flaky "37) test1246(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, (-1), 52, 0, 1, 100 });
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean11 = toStringStyle10.isUseShortClassName();
        java.lang.String str12 = toStringStyle10.getSummaryObjectStartText();
        toStringStyle10.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<" + "'", str12, "<");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayStart("]");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "115) test1248(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer3, (java.lang.Object) "<null>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        java.lang.String str13 = toStringStyle10.getContentStart();
        toStringStyle10.setSummaryObjectStartText("");
        toStringStyle10.setUseClassName(true);
        toStringStyle10.setDefaultFullDetail(true);
        toStringStyle10.setFieldNameValueSeparator("[");
        java.lang.Object[] objArray22 = new java.lang.Object[] { "[" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[[]");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray12 = new boolean[] { true, false, false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "=", booleanArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "116) test1255(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, false, false, false, false, true });
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "117) test1256(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "38) test1256(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "118) test1257(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "39) test1257(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getNullText();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setUseClassName(false);
        toStringStyle10.setNullText("");
        toStringStyle10.setArrayContentDetail(true);
        toStringStyle10.setArraySeparator("");
        java.lang.String str19 = toStringStyle10.getFieldSeparator();
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle10.appendSuper(stringBuffer20, "");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle10);
        java.lang.String str24 = toStringStyle10.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", (java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "119) test1258(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str24, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray23 = new boolean[] { false, true, false, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "120) test1259(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { false, true, false, true, false, false });
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean10 = toStringStyle9.isFieldSeparatorAtEnd();
        java.lang.String str11 = toStringStyle9.getSummaryObjectEndText();
        boolean boolean12 = toStringStyle9.isArrayContentDetail();
        boolean boolean13 = toStringStyle9.isDefaultFullDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "121) test1260(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "40) test1260(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "122) test1261(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "<size=", shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "123) test1262(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart("=");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle15.setFieldNameValueSeparator("hi!");
        java.lang.String str18 = toStringStyle15.getContentStart();
        toStringStyle15.setSummaryObjectStartText("");
        toStringStyle15.setUseClassName(true);
        toStringStyle15.setDefaultFullDetail(true);
        toStringStyle15.setFieldNameValueSeparator("[");
        toStringStyle15.setArraySeparator("<");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer14, (java.lang.Object) "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "124) test1264(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isUseClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "125) test1265(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean9 = toStringStyle8.isFieldSeparatorAtEnd();
        toStringStyle8.setNullText(",");
        java.lang.String str12 = toStringStyle8.getSizeEndText();
        java.lang.String str13 = toStringStyle8.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle8.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setArraySeparator("");
        java.lang.String str18 = toStringStyle15.getContentStart();
        boolean boolean19 = toStringStyle15.isDefaultFullDetail();
        java.lang.String str20 = toStringStyle15.getArrayEnd();
        boolean boolean21 = toStringStyle15.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean23 = toStringStyle22.isFieldSeparatorAtEnd();
        boolean boolean24 = toStringStyle22.isUseFieldNames();
        java.lang.String str25 = toStringStyle22.getSummaryObjectEndText();
        toStringStyle22.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle28.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer31 = null;
        toStringStyle28.appendSuper(stringBuffer31, "hi!");
        boolean boolean34 = toStringStyle28.isArrayContentDetail();
        boolean boolean35 = toStringStyle28.isFieldSeparatorAtStart();
        boolean boolean36 = toStringStyle28.isDefaultFullDetail();
        boolean boolean37 = toStringStyle28.isArrayContentDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle38.setUseShortClassName(false);
        boolean boolean41 = toStringStyle38.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle42.setSummaryObjectStartText("hi!");
        toStringStyle42.setFieldSeparatorAtEnd(false);
        toStringStyle42.setUseIdentityHashCode(true);
        toStringStyle42.setSizeStartText(",");
        boolean boolean51 = toStringStyle42.isUseIdentityHashCode();
        boolean boolean52 = toStringStyle42.isUseShortClassName();
        java.lang.Object[] objArray53 = new java.lang.Object[] { toStringStyle8, boolean21, false, toStringStyle28, toStringStyle38, boolean52 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "[", objArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "=" + "'", str18, "=");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "126) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "41) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[" + "'", str25, "[");
        org.junit.Assert.assertNotNull(toStringStyle28);
// flaky "10) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "4) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "2) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(toStringStyle38);
// flaky "1) test1267(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(toStringStyle42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<size=", (java.lang.Object) (short) 0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "=", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
// flaky "127) test1270(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("hi!");
        java.lang.String str5 = toStringStyle2.getContentStart();
        toStringStyle2.setSummaryObjectStartText("");
        toStringStyle2.setUseClassName(true);
        toStringStyle2.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle2.setFieldSeparatorAtStart(true);
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) true);
        boolean boolean15 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer16, "<", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray14 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "128) test1272(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, false });
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray11 = new double[] { 1L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray11 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", floatArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "129) test1274(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd("[");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean15 = toStringStyle14.isFieldSeparatorAtStart();
        toStringStyle14.setDefaultFullDetail(true);
        boolean boolean18 = toStringStyle14.isFieldSeparatorAtStart();
        toStringStyle14.setSizeStartText("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle21.setFieldNameValueSeparator("hi!");
        toStringStyle21.setSummaryObjectStartText("]");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle26.setFieldNameValueSeparator("hi!");
        java.lang.String str29 = toStringStyle26.getFieldSeparator();
        boolean boolean30 = toStringStyle26.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setFieldNameValueSeparator("hi!");
        toStringStyle31.setUseFieldNames(true);
        toStringStyle31.setArraySeparator("");
        toStringStyle31.setFieldSeparatorAtEnd(false);
        java.lang.Object[] objArray40 = new java.lang.Object[] { toStringStyle14, toStringStyle21, boolean30, toStringStyle31 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", objArray40, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertNotNull(toStringStyle26);
// flaky "130) test1275(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "=" + "'", str29, "=");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayStart("]");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "]");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "]", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray14 = new long[] { 'a', (byte) -1, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", longArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "131) test1279(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 97L, (-1L), 32L, 10L });
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean9 = toStringStyle8.isUseShortClassName();
        boolean boolean10 = toStringStyle8.isUseIdentityHashCode();
        boolean boolean12 = toStringStyle8.isFullDetail((java.lang.Boolean) false);
        java.lang.String str13 = toStringStyle8.getArraySeparator();
        toStringStyle8.setSizeEndText(">");
        java.lang.String str16 = toStringStyle8.getArrayEnd();
        boolean boolean17 = toStringStyle8.isUseClassName();
        toStringStyle8.setNullText("}");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean21 = toStringStyle20.isFieldSeparatorAtEnd();
        java.lang.String str22 = toStringStyle20.getNullText();
        boolean boolean23 = toStringStyle20.isFieldSeparatorAtEnd();
        toStringStyle20.setFieldNameValueSeparator("");
        toStringStyle20.setDefaultFullDetail(false);
        boolean boolean28 = toStringStyle20.isUseShortClassName();
        toStringStyle20.setSummaryObjectStartText("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setSizeEndText("");
        toStringStyle31.setContentEnd(">");
        boolean boolean37 = toStringStyle31.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean39 = toStringStyle38.isUseShortClassName();
        java.lang.String str40 = toStringStyle38.getNullText();
        java.lang.String str41 = toStringStyle38.getFieldSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle42.setSizeEndText("");
        toStringStyle42.setContentEnd("");
        toStringStyle42.setNullText(">");
        toStringStyle42.setDefaultFullDetail(true);
        java.lang.Object[] objArray51 = new java.lang.Object[] { toStringStyle8, toStringStyle20, toStringStyle31, toStringStyle38, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "=", objArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "132) test1280(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "42) test1280(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(toStringStyle38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str40, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "," + "'", str41, ",");
        org.junit.Assert.assertNotNull(toStringStyle42);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray22 = new boolean[] { true, true, true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", booleanArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { true, true, true, false, true, false });
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray16 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.ShortPrefixToStringStyle", charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "133) test1283(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray17 = new int[] { (byte) 1, (byte) -1, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "}", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, (-1), 100, 97 });
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.SimpleToStringStyle", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setUseFieldNames(false);
        boolean boolean17 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer18 = null;
        double[] doubleArray24 = new double[] { (byte) 0, (short) 0, 0L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "", doubleArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 0.0d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray17 = new float[] { (byte) 0, 10.0f, (byte) 1, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 0.0f, 10.0f, 1.0f, 10.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
// flaky "134) test1288(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "43) test1288(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray14 = new float[] { 100.0f, (-1), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "hi!", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ",", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<", charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "ToStringStyle.SimpleToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<" + "'", str5, "<");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "}", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.SimpleToStringStyle", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean4 = toStringStyle3.isFieldSeparatorAtEnd();
        boolean boolean5 = toStringStyle3.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, ">", (java.lang.Object) toStringStyle3, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ">");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "135) test1299(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray12 = new float[] { 0.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray11 = new boolean[] { true, false, false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, ">", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true, false, false, false, false, false });
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer11, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "136) test1302(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray14 = new float[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "<null>", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.SimpleToStringStyle", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "137) test1305(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ', '#', 'a' });
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("]");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "138) test1307(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "44) test1307(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle5.setFieldNameValueSeparator("hi!");
        toStringStyle5.setArrayEnd(">");
        boolean boolean10 = toStringStyle5.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str12 = toStringStyle11.getArraySeparator();
        java.lang.String str13 = toStringStyle11.getFieldSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSizeEndText("");
        toStringStyle14.setContentEnd("");
        java.lang.String str19 = toStringStyle14.getSizeEndText();
        java.lang.String str20 = toStringStyle14.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle21.setSummaryObjectStartText("hi!");
        toStringStyle21.setFieldSeparatorAtEnd(false);
        toStringStyle21.setUseIdentityHashCode(true);
        toStringStyle21.setSizeStartText(",");
        java.lang.String str30 = toStringStyle21.getSummaryObjectEndText();
        java.lang.String str31 = toStringStyle21.getNullText();
        toStringStyle21.setFieldSeparatorAtStart(true);
        toStringStyle21.setFieldNameValueSeparator("hi!");
        java.lang.String str36 = toStringStyle21.getSizeStartText();
        boolean boolean37 = toStringStyle21.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle38.setSummaryObjectStartText("hi!");
        boolean boolean42 = toStringStyle38.isFullDetail((java.lang.Boolean) false);
        toStringStyle38.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str45 = toStringStyle38.getSummaryObjectEndText();
        java.lang.Object[] objArray46 = new java.lang.Object[] { toStringStyle5, str13, toStringStyle14, boolean37, toStringStyle38 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, "", objArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "139) test1308(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(toStringStyle21);
// flaky "45) test1308(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "}" + "'", str30, "}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "]" + "'", str31, "]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "," + "'", str36, ",");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(toStringStyle38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "11) test1308(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "}" + "'", str45, "}");
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "}", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "140) test1312(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean12 = toStringStyle11.isUseShortClassName();
        java.lang.String str13 = toStringStyle11.getNullText();
        java.lang.String str14 = toStringStyle11.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", (java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "141) test1313(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
// flaky "46) test1313(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray17 = new boolean[] { false, true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "<", booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "142) test1314(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false, true, false, true, true, true });
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray11 = new short[] { (byte) 0, (short) 10, (byte) 1, (byte) -1, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "ToStringStyle.SimpleToStringStyle", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 10, (short) 1, (short) -1, (short) 10, (short) -1 });
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray16 = new int[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle", intArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 32 });
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparator("]");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray12 = new short[] { (short) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", shortArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1, (short) 100, (short) 0 });
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("]");
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray17 = new long[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "]", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "143) test1319(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 10L });
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { false, false, true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "[", booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "144) test1320(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { false, false, true, false, true, false });
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArrayStart("<");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "145) test1321(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
// flaky "47) test1321(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray14 = new float[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", floatArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        toStringStyle8.setFieldSeparatorAtEnd(false);
        boolean boolean13 = toStringStyle8.isUseFieldNames();
        toStringStyle8.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "146) test1323(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer13, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "147) test1324(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "]", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray15 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "}", booleanArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "148) test1327(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] {});
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer7, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "149) test1328(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "150) test1329(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray19 = new float[] { (-1L), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "}", floatArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "151) test1330(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "48) test1330(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.Class<?> wildcardClass6 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "152) test1332(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray11 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", booleanArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "153) test1333(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray15 = new float[] { 0.0f, (-1.0f), (short) 100, (-1), 0.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "}", floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 0.0f, (-1.0f), 100.0f, (-1.0f), 0.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray21 = new boolean[] { true, false, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "", booleanArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "154) test1335(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "49) test1335(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, true, true, true, false });
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "155) test1336(org.apache.commons.lang3.builder.RegressionTest2)":             toStringStyle0.appendToString(stringBuffer5, "[");
// flaky "50) test1336(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 5, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray11 = new short[] { (byte) 100, (short) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "=", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "156) test1337(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100, (short) -1, (short) -1, (short) 0, (short) 0 });
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray9 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle.ShortPrefixToStringStyle", booleanArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false, true, true, true });
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        java.lang.String str12 = toStringStyle9.getSizeEndText();
        java.lang.String str13 = toStringStyle9.getContentEnd();
        java.lang.Object[] objArray14 = new java.lang.Object[] { toStringStyle9 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "=", objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "157) test1339(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setSizeStartText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setUseClassName(false);
        toStringStyle9.setNullText("");
        toStringStyle9.setArrayContentDetail(true);
        toStringStyle9.setArraySeparator("");
        boolean boolean18 = toStringStyle9.isUseShortClassName();
        toStringStyle9.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle9.appendToString(stringBuffer21, "]");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle24.setSummaryObjectStartText("hi!");
        java.lang.String str27 = toStringStyle24.getArraySeparator();
        java.lang.String str28 = toStringStyle24.getContentEnd();
        toStringStyle24.setSizeStartText("hi!");
        java.lang.String str31 = toStringStyle24.getFieldNameValueSeparator();
        toStringStyle24.setArraySeparator("}");
        java.lang.Object[] objArray34 = new java.lang.Object[] { toStringStyle9, toStringStyle24 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", objArray34, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toStringStyle24);
// flaky "158) test1341(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "]" + "'", str27, "]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray13 = new int[] { 'a', '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 35, 1 });
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "{", byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer12, "<null>", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray16 = new short[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "[", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "159) test1346(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 10, (short) 10, (short) 1, (short) 100, (short) 0 });
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray9 = new short[] { (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.ShortPrefixToStringStyle", shortArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 1, (short) 100 });
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray12 = new double[] { 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray8 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "hi!", booleanArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { false, false, false });
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "160) test1350(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "51) test1350(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<null>", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "161) test1352(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setArraySeparator("");
        boolean boolean10 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        boolean boolean11 = toStringStyle6.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "<size=", (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "162) test1356(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "163) test1357(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "52) test1357(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer4, "");
// flaky "164) test1358(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 5, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "53) test1358(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer5, "<null>", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "165) test1359(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
// flaky "54) test1359(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray15 = new double[] { '#', 1L, 0L, (short) 0, 0.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ">", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "166) test1361(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d, 1.0d, 0.0d, 0.0d, 0.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.String str14 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("<size=");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "167) test1362(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
// flaky "55) test1362(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer10, obj11);
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator(",");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray18 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "=", booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] {});
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray14 = new int[] { (short) 10, (byte) -1, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "168) test1364(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10, (-1), (-1), (-1) });
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeEndText("");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) "");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "]", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "169) test1367(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, "=", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setNullText("{");
        java.lang.Class<?> wildcardClass14 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "170) test1370(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "56) test1370(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray17 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "171) test1371(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true, false, false });
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray13 = new int[] { (byte) 100, (byte) 1, (short) 10, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ">", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 100, 1, 10, 10, 35 });
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray15 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, ">", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true });
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isUseClassName();
        java.lang.String str13 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean17 = toStringStyle16.isFieldSeparatorAtEnd();
        java.lang.String str18 = toStringStyle16.getNullText();
        boolean boolean19 = toStringStyle16.isFieldSeparatorAtEnd();
        toStringStyle16.setFieldNameValueSeparator("");
        toStringStyle16.setDefaultFullDetail(false);
        toStringStyle16.setArrayContentDetail(true);
        boolean boolean26 = toStringStyle16.isUseFieldNames();
        java.lang.String str27 = toStringStyle16.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer14, "}", (java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        toStringStyle13.setFieldSeparatorAtEnd(false);
        toStringStyle13.setUseIdentityHashCode(true);
        toStringStyle13.setUseShortClassName(false);
        boolean boolean22 = toStringStyle13.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer11, "hi!", (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "172) test1375(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "173) test1376(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "174) test1377(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "{", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSizeEndText("");
        toStringStyle8.setContentEnd("");
        toStringStyle8.setArrayContentDetail(false);
        java.lang.String str15 = toStringStyle8.getSummaryObjectStartText();
        java.lang.String str16 = toStringStyle8.getSummaryObjectEndText();
        boolean boolean18 = toStringStyle8.isFullDetail((java.lang.Boolean) true);
        boolean boolean19 = toStringStyle8.isUseClassName();
        java.lang.String str20 = toStringStyle8.getSummaryObjectStartText();
        java.lang.String str21 = toStringStyle8.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer6, "", (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "175) test1379(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<null>" + "'", str21, "<null>");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.ShortPrefixToStringStyle", floatArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "176) test1380(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
// flaky "57) test1380(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "12) test1380(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isUseClassName();
        java.lang.String str13 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean19 = toStringStyle18.isFieldSeparatorAtStart();
        toStringStyle18.setSummaryObjectEndText(">");
        java.lang.String str22 = toStringStyle18.getArraySeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "hi!", (java.lang.Object) toStringStyle18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "177) test1381(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "58) test1381(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "178) test1382(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("]");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray10 = new int[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", intArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "179) test1383(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1 });
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray21 = new char[] { ' ', ' ', '#', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "}", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "180) test1384(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "59) test1384(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', ' ', '#', ' ', 'a', '#' });
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray12 = new long[] { (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<null>", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "181) test1386(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 10L, 32L });
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "182) test1387(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray15 = new double[] { (byte) 10, (-1L), 1L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "60) test1387(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "183) test1388(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSizeEndText("");
        toStringStyle10.setContentEnd("");
        toStringStyle10.setArrayContentDetail(false);
        java.lang.String str17 = toStringStyle10.getSummaryObjectStartText();
        java.lang.String str18 = toStringStyle10.getArrayStart();
        toStringStyle10.setFieldSeparatorAtStart(false);
        toStringStyle10.setSizeStartText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "61) test1388(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "]" + "'", str17, "]");
// flaky "13) test1388(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "=" + "'", str18, "=");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray12 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<null>", shortArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "=", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "184) test1390(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "185) test1391(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "62) test1391(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<", obj16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "186) test1392(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "63) test1392(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray15 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", byteArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "187) test1393(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100 });
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray17 = new double[] { 100, (short) -1, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "[", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "188) test1396(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setArrayEnd(",");
        toStringStyle13.setSummaryObjectStartText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "{", (java.lang.Object) toStringStyle13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "189) test1397(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "64) test1397(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "190) test1398(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "65) test1398(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer10, obj11);
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ">", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, ">", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray12 = new double[] { 100.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ",", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray11 = new char[] { ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.SimpleToStringStyle", charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', ' ' });
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setFieldNameValueSeparator("hi!");
        toStringStyle11.setSummaryObjectStartText("]");
        boolean boolean16 = toStringStyle11.isFieldSeparatorAtStart();
        java.lang.String str17 = toStringStyle11.getArraySeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer9, "[", (java.lang.Object) toStringStyle11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray21 = new int[] { 0, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "{", intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "191) test1404(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 10, (-1) });
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer3, "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArraySeparator("]");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray14 = new int[] { '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "]", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "192) test1406(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
// flaky "66) test1406(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52, 100 });
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSizeEndText("");
        toStringStyle15.setContentEnd("");
        toStringStyle15.setArrayContentDetail(false);
        java.lang.String str22 = toStringStyle15.getNullText();
        boolean boolean23 = toStringStyle15.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle15);
        toStringStyle15.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle15.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "{", (java.lang.Object) toStringStyle15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "193) test1407(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer8, "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray11 = new short[] { (byte) 1, (byte) -1, (byte) -1, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "}", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 1, (short) -1, (short) -1, (short) 1, (short) 10 });
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        long[] longArray11 = new long[] { 100, 'a', 100L, (short) 10, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "{", longArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 100L, 97L, 100L, 10L, 1L, (-1L) });
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, ",");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray18 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "[", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "194) test1413(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "]", byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "195) test1414(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "67) test1414(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer1, "=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ">", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test1416(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer2 = null;
        long[] longArray4 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "ToStringStyle.SimpleToStringStyle", longArray4, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "197) test1418(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
// flaky "198) test1419(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendFieldStart(stringBuffer5, "<");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "68) test1419(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray16 = new float[] { 1, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "]", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "199) test1420(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSizeEndText("");
        toStringStyle6.setContentEnd("");
        toStringStyle6.setArrayContentDetail(false);
        toStringStyle6.setFieldSeparator("<null>");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer4, "{", (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "200) test1422(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSizeEndText("");
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) "");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray16 = new long[] { (short) 1, 10, 100L, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "<", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, 10L, 100L, 100L, 0L });
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer12, "");
// flaky "201) test1424(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test1424(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "14) test1424(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "5) test1424(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "3) test1424(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray15 = new double[] { (-1L), 'a', '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 97.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray16 = new long[] { (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "=", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "202) test1426(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "70) test1426(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, (-1L) });
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray22 = new double[] { '#', 'a', 0.0d, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "<size=", doubleArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "203) test1427(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "71) test1427(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 35.0d, 97.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer3, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "204) test1429(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean12 = toStringStyle11.isUseShortClassName();
        boolean boolean13 = toStringStyle11.isUseIdentityHashCode();
        toStringStyle11.setNullText(">");
        toStringStyle11.setSummaryObjectStartText("<null>");
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        boolean boolean19 = toStringStyle11.isUseShortClassName();
        toStringStyle11.setFieldSeparator("}");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) "}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "205) test1430(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle9.appendSuper(stringBuffer12, "hi!");
        boolean boolean15 = toStringStyle9.isArrayContentDetail();
        java.lang.String str16 = toStringStyle9.getArraySeparator();
// flaky "206) test1431(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) str16);
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray24 = new float[] { 1.0f, 0.0f, 0L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer18, "{", floatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 0.0f, 0.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSizeEndText("");
        toStringStyle7.setContentEnd("");
        toStringStyle7.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle7.getNullText();
        boolean boolean15 = toStringStyle7.isUseIdentityHashCode();
        toStringStyle7.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean18 = toStringStyle7.isDefaultFullDetail();
        java.lang.String str19 = toStringStyle7.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer6, (java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "207) test1432(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str19, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "208) test1433(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "72) test1433(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "15) test1433(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "209) test1434(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, ">", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        boolean boolean10 = toStringStyle0.isUseClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "[", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "210) test1436(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<null>", (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer10, "=");
// flaky "211) test1438(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "73) test1438(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer3 = null;
        double[] doubleArray6 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, "}", doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle3.setSizeEndText("");
        toStringStyle3.setContentEnd("");
        toStringStyle3.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle3.getNullText();
        boolean boolean11 = toStringStyle3.isUseIdentityHashCode();
        toStringStyle3.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean14 = toStringStyle3.isUseFieldNames();
        java.lang.String str15 = toStringStyle3.getSizeEndText();
        toStringStyle3.setNullText("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer1, "", (java.lang.Object) toStringStyle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "212) test1440(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "74) test1440(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray16 = new float[] { (-1), (short) 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "213) test1441(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { (-1.0f), 10.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray22 = new int[] { (byte) 1, '4', (short) 100, (short) -1, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "=", intArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "214) test1442(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<" + "'", str11, "<");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 52, 100, (-1), 35, 32 });
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray13 = new long[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 100L });
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray24 = new long[] { (byte) 0, (byte) 0, (byte) 0, 'a', (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "{", longArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "215) test1445(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<" + "'", str10, "<");
// flaky "75) test1445(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L, 0L, 0L, 97L, 10L, 0L });
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setContentStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.String str12 = toStringStyle0.getNullText();
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray20 = new float[] { (short) -1, (-1), (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.SimpleToStringStyle", floatArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "216) test1447(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "76) test1447(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<" + "'", str12, "<");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { (-1.0f), (-1.0f), 10.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, ">", obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "217) test1448(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "218) test1449(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle2.setSummaryObjectStartText("hi!");
        boolean boolean6 = toStringStyle2.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle2.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer1, (java.lang.Object) boolean7);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectEndText("");
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray20 = new char[] { '#', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<", charArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "219) test1452(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<" + "'", str10, "<");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', ' ', 'a' });
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) "[");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "220) test1453(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray12 = new float[] { (short) -1, (-1L), (short) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "221) test1454(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { (-1.0f), (-1.0f), 0.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle7.appendSuper(stringBuffer10, "hi!");
        boolean boolean13 = toStringStyle7.isArrayContentDetail();
        boolean boolean14 = toStringStyle7.isFieldSeparatorAtStart();
        toStringStyle7.setArrayContentDetail(false);
        java.lang.String str17 = toStringStyle7.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle18.setSizeEndText("");
        toStringStyle18.setContentEnd("");
        toStringStyle18.setArrayContentDetail(false);
        java.lang.String str25 = toStringStyle18.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle26.setUseClassName(false);
        boolean boolean29 = toStringStyle26.isFieldSeparatorAtEnd();
        java.lang.String str30 = toStringStyle26.getArraySeparator();
        boolean boolean32 = toStringStyle26.isFullDetail((java.lang.Boolean) true);
        toStringStyle26.setUseShortClassName(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle35 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle35.setUseFieldNames(true);
        toStringStyle35.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.Object[] objArray40 = new java.lang.Object[] { toStringStyle7, str25, toStringStyle26, "ToStringStyle.ShortPrefixToStringStyle" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "]", objArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
        org.junit.Assert.assertNotNull(toStringStyle26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(toStringStyle35);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray13 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "{", floatArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray13 = new int[] { (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.SimpleToStringStyle", intArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 52 });
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "]", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray16 = new double[] { 10.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<null>", doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "222) test1460(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
// flaky "77) test1460(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray14 = new boolean[] { true, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, false, false, false });
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "{", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        char[] charArray9 = new char[] { 'a', ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, "{", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', ' ', '4', 'a' });
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart(",");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ",", byteArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray11 = new boolean[] { true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "223) test1467(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true, false, false });
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", byteArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "224) test1468(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean17 = toStringStyle16.isFieldSeparatorAtEnd();
        boolean boolean18 = toStringStyle16.isUseFieldNames();
        java.lang.String str19 = toStringStyle16.getSummaryObjectStartText();
        toStringStyle16.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle16.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer14, ",", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "225) test1474(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray18 = new char[] { ' ', ' ', ' ', 'a', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "226) test1475(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ', ' ', 'a', ' ', '4' });
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray11 = new long[] { 100L, '4', (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
// flaky "227) test1477(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 100L, 52L, (-1L), 0L });
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "=", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("}");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray18 = new long[] { (-1), (short) -1, (short) -1, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "[", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "228) test1479(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "78) test1479(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { (-1L), (-1L), (-1L), 0L, 97L });
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer13, "]");
// flaky "229) test1480(org.apache.commons.lang3.builder.RegressionTest2)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "79) test1480(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer9, "<", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "230) test1481(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray9 = new float[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<", floatArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "231) test1482(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "[", byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setContentEnd(">");
        java.lang.String str16 = toStringStyle11.getFieldSeparator();
        toStringStyle11.setSummaryObjectStartText(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "232) test1485(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setArraySeparator("");
        java.lang.String str18 = toStringStyle15.getSummaryObjectEndText();
        toStringStyle15.setUseShortClassName(false);
        boolean boolean21 = toStringStyle15.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "=", (java.lang.Object) toStringStyle15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "233) test1486(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "80) test1486(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "234) test1487(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "<size=", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        toStringStyle13.setFieldSeparatorAtEnd(false);
        toStringStyle13.setUseIdentityHashCode(true);
        toStringStyle13.setSizeStartText(",");
        java.lang.String str22 = toStringStyle13.getSummaryObjectEndText();
        boolean boolean23 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setFieldSeparatorAtStart(false);
        java.lang.String str26 = toStringStyle13.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "235) test1489(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "81) test1489(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<null>" + "'", str26, "<null>");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray16 = new long[] { (-1), 0, ' ', (short) 100, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", longArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L), 0L, 32L, 100L, 10L, 1L });
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray19 = new float[] { (byte) 10, 10L, (-1), (byte) 10, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "236) test1491(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 10.0f, 10.0f, (-1.0f), 10.0f, 1.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
// flaky "237) test1492(org.apache.commons.lang3.builder.RegressionTest2)":         toStringStyle0.appendSuper(stringBuffer12, "]");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray18 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.ShortPrefixToStringStyle", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "82) test1492(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "16) test1492(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "6) test1492(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "4) test1492(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.Class<?> wildcardClass17 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "238) test1493(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray12 = new long[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "{", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 10L });
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray12 = new double[] { 100.0f, (short) 100, 10.0f, ' ', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "<size=", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "239) test1495(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d, 10.0d, 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ">", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "240) test1496(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSummaryObjectStartText("hi!");
        toStringStyle15.setFieldSeparatorAtEnd(false);
        boolean boolean20 = toStringStyle15.isUseFieldNames();
        boolean boolean22 = toStringStyle15.isFullDetail((java.lang.Boolean) true);
        boolean boolean24 = toStringStyle15.isFullDetail((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer14, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSizeEndText("");
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) "");
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "]", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray18 = new float[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "[", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "241) test1499(org.apache.commons.lang3.builder.RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", byteArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) 100 });
    }
}
