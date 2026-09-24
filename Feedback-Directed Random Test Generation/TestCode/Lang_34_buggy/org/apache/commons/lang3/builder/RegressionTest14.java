package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "=");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray15 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "{", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test7001(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
// flaky "1) test7001(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "1) test7001(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
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
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test7002(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "2) test7002(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "2) test7002(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "1) test7002(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeStartText("<");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer8, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test7003(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "3) test7003(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean11 = toStringStyle0.isUseClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test7004(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
// flaky "4) test7004(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<" + "'", str8, "<");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "3) test7004(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
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
        double[] doubleArray21 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.SimpleToStringStyle", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "5) test7005(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArraySeparator("{");
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "6) test7007(org.apache.commons.lang3.builder.RegressionTest14)":             toStringStyle0.appendToString(stringBuffer15, ",");
// flaky "5) test7007(org.apache.commons.lang3.builder.RegressionTest14)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
// flaky "4) test7007(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "2) test7007(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("]");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendFieldStart(stringBuffer14, "ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArrayStart("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer19, "ToStringStyle.NoFieldNameToStringStyle", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "7) test7008(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("}");
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "8) test7009(org.apache.commons.lang3.builder.RegressionTest14)":             toStringStyle0.appendSuper(stringBuffer14, ">");
// flaky "6) test7009(org.apache.commons.lang3.builder.RegressionTest14)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "5) test7009(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "9) test7010(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
// flaky "7) test7010(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setFieldNameValueSeparator("hi!");
        java.lang.String str10 = toStringStyle7.getContentStart();
        java.lang.String str11 = toStringStyle7.getSizeEndText();
        java.lang.String str12 = toStringStyle7.getSizeStartText();
        toStringStyle7.setUseIdentityHashCode(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer5, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "10) test7011(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayEnd("<null>");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle10.appendSuper(stringBuffer13, "hi!");
        boolean boolean16 = toStringStyle10.isArrayContentDetail();
        boolean boolean17 = toStringStyle10.isFieldSeparatorAtStart();
        boolean boolean18 = toStringStyle10.isDefaultFullDetail();
        boolean boolean19 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle10);
        toStringStyle10.setFieldSeparatorAtEnd(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer8, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) toStringStyle10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "11) test7013(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "8) test7013(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "6) test7013(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeStartText("<");
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray11 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4' });
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArraySeparator("<");
        toStringStyle0.setSizeStartText(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str12 = toStringStyle0.getContentStart();
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "12) test7016(org.apache.commons.lang3.builder.RegressionTest14)":             toStringStyle0.appendToString(stringBuffer14, "<size=");
// flaky "9) test7016(org.apache.commons.lang3.builder.RegressionTest14)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 6, length 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test7016(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "3) test7016(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "1) test7016(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test7017(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
// flaky "10) test7017(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentEnd("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldNameValueSeparator("=");
        boolean boolean6 = toStringStyle0.isUseClassName();
        java.lang.Class<?> wildcardClass7 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "14) test7019(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "11) test7019(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = toStringStyle0.isUseClassName();
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "15) test7020(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
// flaky "12) test7020(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        toStringStyle13.setArrayContentDetail(true);
        toStringStyle13.setUseClassName(true);
        toStringStyle13.setDefaultFullDetail(true);
        toStringStyle13.setSizeEndText("<");
        java.lang.String str24 = toStringStyle13.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer11, "=", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<" + "'", str24, "<");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setFieldSeparator("{");
        toStringStyle0.setSizeEndText("}");
        toStringStyle0.setSizeStartText(">");
        boolean boolean14 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}" + "'", str2, "}");
// flaky "16) test7022(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
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
// flaky "17) test7023(org.apache.commons.lang3.builder.RegressionTest14)":         toStringStyle0.appendSuper(stringBuffer15, "{");
        toStringStyle0.setFieldSeparator("<size=");
        java.lang.StringBuffer stringBuffer20 = null;
        char[] charArray28 = new char[] { ' ', '#', 'a', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "]", charArray28, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', '#', 'a', 'a', 'a', '4' });
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseClassName(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray17 = new short[] { (short) 100, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "18) test7024(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100, (short) 100, (short) 0 });
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "19) test7025(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "13) test7025(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "8) test7025(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setSizeStartText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        toStringStyle0.setSizeStartText("]");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) "]");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle0.getSizeEndText();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str17 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeStartText("[");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "20) test7029(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray15 = new float[] { '4', 'a', 10.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 52.0f, 97.0f, 10.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str7 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldNameValueSeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test7031(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("hi!");
        java.lang.String str20 = toStringStyle17.getContentStart();
        java.lang.String str21 = toStringStyle17.getSizeEndText();
        toStringStyle17.setFieldSeparatorAtStart(false);
        boolean boolean24 = toStringStyle17.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle25.setSizeEndText("");
        toStringStyle25.setContentEnd("");
        java.lang.String str30 = toStringStyle25.getSizeEndText();
        toStringStyle25.setFieldSeparator("");
        toStringStyle25.setUseFieldNames(true);
        java.lang.String str35 = toStringStyle25.getArrayEnd();
        toStringStyle25.setArraySeparator("");
        toStringStyle25.setFieldSeparatorAtEnd(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str41 = toStringStyle40.getNullText();
        boolean boolean42 = toStringStyle40.isFieldSeparatorAtEnd();
        toStringStyle40.setSizeEndText("=");
        boolean boolean45 = toStringStyle40.isUseFieldNames();
        java.lang.Object[] objArray46 = new java.lang.Object[] { toStringStyle17, false, toStringStyle40 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", objArray46, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "22) test7032(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[" + "'", str20, "[");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str21, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str35, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle40);
// flaky "14) test7032(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
// flaky "9) test7032(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean9 = toStringStyle8.isUseShortClassName();
        boolean boolean10 = toStringStyle8.isUseIdentityHashCode();
        boolean boolean12 = toStringStyle8.isFullDetail((java.lang.Boolean) false);
        java.lang.String str13 = toStringStyle8.getArraySeparator();
        toStringStyle8.setSizeEndText(">");
        java.lang.String str16 = toStringStyle8.getSizeStartText();
        boolean boolean17 = toStringStyle8.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) boolean17);
        java.lang.String str19 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str19, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.SimpleToStringStyle", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 52L });
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.SimpleToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldNameValueSeparator("=");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSummaryObjectStartText("hi!");
        java.lang.String str10 = toStringStyle7.getArraySeparator();
        java.lang.String str11 = toStringStyle7.getContentEnd();
        boolean boolean12 = toStringStyle7.isDefaultFullDetail();
        boolean boolean13 = toStringStyle7.isDefaultFullDetail();
        java.lang.String str14 = toStringStyle7.getContentEnd();
        java.lang.String str15 = toStringStyle7.getSummaryObjectStartText();
        toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) toStringStyle7);
        java.lang.StringBuffer stringBuffer17 = null;
        float[] floatArray22 = new float[] { 10L, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "=", floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test7036(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "15) test7036(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
// flaky "10) test7036(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "4) test7036(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 10.0f, 35.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.SimpleToStringStyle", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setContentEnd("}");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "]");
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "24) test7039(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSizeEndText("");
        toStringStyle7.setContentEnd("");
        java.lang.String str12 = toStringStyle7.getSizeEndText();
        toStringStyle7.setFieldSeparator("");
        toStringStyle7.setUseFieldNames(true);
        java.lang.String str17 = toStringStyle7.getSizeStartText();
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle19.setFieldNameValueSeparator("hi!");
        java.lang.String str22 = toStringStyle19.getContentStart();
        toStringStyle19.setArrayContentDetail(false);
        boolean boolean26 = toStringStyle19.isFullDetail((java.lang.Boolean) false);
        toStringStyle7.appendClassName(stringBuffer18, (java.lang.Object) toStringStyle19);
        toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) toStringStyle7);
        toStringStyle0.setSizeStartText("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "25) test7040(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[" + "'", str22, "[");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectStartText(",");
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setContentEnd("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "26) test7041(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        boolean boolean2 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeEndText("=");
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "27) test7042(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "16) test7042(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "11) test7042(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { 0.0f, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f, 52.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray16 = new float[] { 'a', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<size=", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str2, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 97.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray15 = new char[] { '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", charArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test7046(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "17) test7046(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '4' });
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setContentEnd("ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSizeEndText("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setContentStart("hi!");
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "<", charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', 'a' });
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer17 = null;
        char[] charArray21 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "<", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "29) test7052(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "18) test7052(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#' });
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer6, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setArraySeparator("ToStringStyle.DefaultToStringStyle");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, ">", byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "30) test7056(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { (byte) 1, (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "{", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, 10L, 32L });
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
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
        toStringStyle0.setArrayStart("}");
        toStringStyle0.setSummaryObjectEndText("[");
        boolean boolean18 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "31) test7058(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.String str12 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "32) test7059(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendFieldStart(stringBuffer9, "hi!");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setSummaryObjectStartText("hi!");
        toStringStyle16.setFieldSeparatorAtEnd(false);
        toStringStyle16.setUseIdentityHashCode(true);
        toStringStyle16.setUseShortClassName(false);
        boolean boolean25 = toStringStyle16.isFieldSeparatorAtEnd();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0.0f, toStringStyle16 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str2 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str2, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSizeEndText("<");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle20.setUseClassName(false);
        boolean boolean23 = toStringStyle20.isFieldSeparatorAtEnd();
        java.lang.String str24 = toStringStyle20.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle20);
        toStringStyle20.setArrayStart("");
        boolean boolean28 = toStringStyle20.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) boolean28, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<" + "'", str24, "<");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "33) test7064(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeEndText("=");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ">", (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("}");
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray19 = new boolean[] { true, true, false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "}", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "34) test7067(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, false, false, true, false });
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        boolean[] booleanArray5 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "ToStringStyle.ShortPrefixToStringStyle", booleanArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { false });
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setFieldSeparator("{");
        toStringStyle0.setSizeEndText("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "35) test7069(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray15 = new boolean[] { true, false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "[", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "36) test7070(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, true, false, false, true });
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendFieldStart(stringBuffer5, ">");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayEnd("]");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "{");
        toStringStyle0.setSizeStartText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "]", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "37) test7073(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getArrayStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "38) test7074(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayStart("<");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean12 = toStringStyle11.isFieldSeparatorAtEnd();
        toStringStyle11.setNullText(",");
        toStringStyle11.setSizeStartText("<size=");
        toStringStyle11.setArrayStart("]");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle19.setSummaryObjectStartText("hi!");
        java.lang.String str22 = toStringStyle19.getArraySeparator();
        java.lang.String str23 = toStringStyle19.getContentEnd();
        boolean boolean24 = toStringStyle19.isDefaultFullDetail();
        boolean boolean25 = toStringStyle19.isDefaultFullDetail();
        boolean boolean26 = toStringStyle19.isDefaultFullDetail();
        java.lang.String str27 = toStringStyle19.getSummaryObjectStartText();
        toStringStyle19.setSummaryObjectEndText("<null>");
        boolean boolean30 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle19);
        toStringStyle19.setUseClassName(false);
        java.lang.Object[] objArray33 = new java.lang.Object[] { "]", toStringStyle19 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", objArray33, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "39) test7075(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
// flaky "19) test7075(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str22, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ">" + "'", str23, ">");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.String str11 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayStart("{");
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSummaryObjectStartText("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "40) test7076(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        boolean boolean13 = toStringStyle0.isUseClassName();
        boolean boolean15 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str16 = toStringStyle0.getSizeEndText();
        java.lang.String str17 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean19 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<null>" + "'", str17, "<null>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArraySeparator("]");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray17 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "[", booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "41) test7078(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true, false });
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setNullText("");
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle17.setSummaryObjectStartText("hi!");
        toStringStyle17.setDefaultFullDetail(true);
        boolean boolean22 = toStringStyle17.isUseClassName();
        toStringStyle17.setDefaultFullDetail(true);
        boolean boolean25 = toStringStyle17.isFieldSeparatorAtStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ">", (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "42) test7081(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getNullText();
        toStringStyle0.setSummaryObjectEndText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "43) test7082(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean9 = toStringStyle0.isUseClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArrayEnd("<null>");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setSummaryObjectStartText("hi!");
        toStringStyle16.setFieldSeparatorAtEnd(false);
        toStringStyle16.setUseIdentityHashCode(true);
        toStringStyle16.setSizeStartText(",");
        java.lang.String str25 = toStringStyle16.getSummaryObjectEndText();
        java.lang.String str26 = toStringStyle16.getNullText();
        boolean boolean27 = toStringStyle16.isUseIdentityHashCode();
        toStringStyle16.setArrayStart("hi!");
        toStringStyle16.setNullText("ToStringStyle.DefaultToStringStyle");
        java.lang.Object[] objArray32 = new java.lang.Object[] { "ToStringStyle.DefaultToStringStyle" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.ShortPrefixToStringStyle", objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "]" + "'", str26, "]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[ToStringStyle.DefaultToStringStyle]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[ToStringStyle.DefaultToStringStyle]");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("<");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "44) test7084(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "=", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "45) test7085(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "20) test7085(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str2, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "12) test7085(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setArraySeparator("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "46) test7086(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("{");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "<size=", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "47) test7088(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArraySeparator("]");
        toStringStyle0.setContentStart(">");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test7090(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setUseFieldNames(false);
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        boolean boolean13 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectEndText("=");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSummaryObjectStartText("hi!");
        java.lang.String str17 = toStringStyle14.getArraySeparator();
        java.lang.String str18 = toStringStyle14.getContentEnd();
        boolean boolean19 = toStringStyle14.isDefaultFullDetail();
        boolean boolean20 = toStringStyle14.isDefaultFullDetail();
        boolean boolean21 = toStringStyle14.isDefaultFullDetail();
        toStringStyle14.setFieldSeparator("hi!");
        java.lang.String str24 = toStringStyle14.getSizeEndText();
        java.lang.String str25 = toStringStyle14.getArrayEnd();
        toStringStyle0.appendClassName(stringBuffer13, (java.lang.Object) str25);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<null>" + "'", str25, "<null>");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText("<");
        toStringStyle0.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        boolean boolean18 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<" + "'", str16, "<");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str17, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
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
        toStringStyle0.setArrayStart("}");
        toStringStyle0.setSummaryObjectEndText("[");
        boolean boolean18 = toStringStyle0.isDefaultFullDetail();
        boolean boolean19 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<size=", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "49) test7096(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray14 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.DefaultToStringStyle", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
// flaky "50) test7098(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "21) test7098(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] {});
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray12 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "]", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.Class<?> wildcardClass12 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("}");
        toStringStyle0.setSummaryObjectEndText("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "51) test7101(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setSummaryObjectStartText("{");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeEndText("{");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        java.lang.String str12 = toStringStyle9.getContentStart();
        java.lang.String str13 = toStringStyle9.getSizeEndText();
        java.lang.String str14 = toStringStyle9.getSizeStartText();
        toStringStyle9.setUseIdentityHashCode(false);
        toStringStyle9.setFieldSeparator("=");
        java.lang.String str19 = toStringStyle9.getSizeEndText();
        toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) toStringStyle9);
        boolean boolean22 = toStringStyle9.isFullDetail((java.lang.Boolean) true);
        toStringStyle9.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<" + "'", str13, "<");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<" + "'", str19, "<");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setSizeEndText(">");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isArrayContentDetail();
        java.lang.String str3 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "{", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "52) test7107(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("]");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray13 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "53) test7108(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', ' ' });
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "54) test7109(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray12 = new long[] { 1, (byte) 1, 1L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "[", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "55) test7110(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 1L, 1L, 1L, 1L });
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        toStringStyle0.setSizeStartText("}");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "56) test7111(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setUseFieldNames(false);
        boolean boolean18 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer19 = null;
        int[] intArray26 = new int[] { (-1), ' ', (short) 10, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, "", intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "57) test7112(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 32, 10, 32, 100 });
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "58) test7113(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setFieldNameValueSeparator("hi!");
        toStringStyle16.setUseFieldNames(true);
        toStringStyle16.setArraySeparator("");
        java.lang.String str23 = toStringStyle16.getFieldNameValueSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle24.setSummaryObjectStartText("hi!");
        toStringStyle24.setFieldSeparatorAtEnd(false);
        toStringStyle24.setUseIdentityHashCode(true);
        toStringStyle24.setSizeStartText(",");
        java.lang.String str33 = toStringStyle24.getSummaryObjectEndText();
        java.lang.String str34 = toStringStyle24.getNullText();
        toStringStyle24.setContentEnd(",");
        toStringStyle24.setDefaultFullDetail(true);
        boolean boolean39 = toStringStyle24.isUseIdentityHashCode();
        java.lang.String str40 = toStringStyle24.getNullText();
        java.lang.Object[] objArray41 = new java.lang.Object[] { toStringStyle16, str40 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<null>", objArray41, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "59) test7114(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "22) test7114(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "]" + "'", str33, "]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "," + "'", str34, ",");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "," + "'", str40, ",");
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
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
        java.lang.String str16 = toStringStyle0.getContentEnd();
        java.lang.String str17 = toStringStyle0.getFieldSeparator();
        java.lang.String str18 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getFieldSeparator();
        java.lang.Class<?> wildcardClass17 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray13 = new char[] { '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#' });
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseShortClassName(false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str11);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArraySeparator("<size=");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setArraySeparator("");
        java.lang.String str18 = toStringStyle15.getContentStart();
        boolean boolean19 = toStringStyle15.isDefaultFullDetail();
        toStringStyle15.setFieldSeparatorAtEnd(false);
        boolean boolean22 = toStringStyle15.isUseIdentityHashCode();
        toStringStyle15.setFieldNameValueSeparator("ToStringStyle.DefaultToStringStyle");
        toStringStyle15.setContentStart("ToStringStyle.SimpleToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "]", (java.lang.Object) toStringStyle15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
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
        java.lang.String str14 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("<size=");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.DefaultToStringStyle", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSummaryObjectEndText("<size=");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer15, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "}", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "60) test7126(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
// flaky "23) test7126(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "13) test7126(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str9, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "5) test7126(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        java.lang.String str16 = toStringStyle13.getSummaryObjectEndText();
        boolean boolean17 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean20 = toStringStyle13.isUseFieldNames();
        toStringStyle13.setUseIdentityHashCode(true);
        toStringStyle0.appendClassName(stringBuffer12, (java.lang.Object) toStringStyle13);
        toStringStyle13.setSizeStartText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<size=" + "'", str16, "<size=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("}");
        toStringStyle0.setArraySeparator(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "61) test7128(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        toStringStyle0.setSizeStartText("]");
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setArrayEnd(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
// flaky "62) test7129(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "24) test7129(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ",", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str11 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray19 = new char[] { ' ', '#', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "63) test7132(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', '#', ' ', ' ', ' ' });
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setSizeEndText("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
// flaky "64) test7133(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setSummaryObjectEndText("]");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray14 = new short[] { (short) 10, (short) -1, (short) 10, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "]" + "'", str6, "]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) -1, (short) 10, (short) 10, (short) 100 });
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectStartText(",");
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSizeStartText("=");
        java.lang.String str17 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "65) test7135(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        boolean boolean14 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "]", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "66) test7136(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getArrayStart();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "67) test7137(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { false, false });
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setSummaryObjectEndText("");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "68) test7138(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSizeEndText("");
        toStringStyle13.setContentEnd("");
        toStringStyle13.setArrayContentDetail(false);
        java.lang.String str20 = toStringStyle13.getSummaryObjectStartText();
        java.lang.String str21 = toStringStyle13.getSummaryObjectEndText();
        boolean boolean23 = toStringStyle13.isFullDetail((java.lang.Boolean) true);
        boolean boolean24 = toStringStyle13.isUseClassName();
        java.lang.String str25 = toStringStyle13.getFieldNameValueSeparator();
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) str25);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test7139(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "25) test7139(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str2, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
// flaky "14) test7139(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayStart("[");
        toStringStyle0.setSizeEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle17.setSummaryObjectStartText("hi!");
        toStringStyle17.setFieldSeparatorAtEnd(false);
        boolean boolean22 = toStringStyle17.isUseFieldNames();
        boolean boolean24 = toStringStyle17.isFullDetail((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer16, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.String str14 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "hi!", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "70) test7141(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArraySeparator("<size=");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray18 = new short[] { (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "[", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test7143(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 0, (short) -1, (short) 100 });
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendFieldStart(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle");
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "72) test7144(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { 10, (-1.0d), 100, 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 100.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray14 = new float[] { (-1.0f), 10, 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "73) test7146(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str2, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { (-1.0f), 10.0f, 10.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean10 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "74) test7147(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean13 = toStringStyle0.isUseClassName();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray21 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "75) test7148(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "26) test7148(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
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
        long[] longArray17 = new long[] { 0, (byte) -1, 10L, 100L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
// flaky "76) test7149(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "27) test7149(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "15) test7149(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, (-1L), 10L, 100L, (-1L) });
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle2.setSummaryObjectStartText("hi!");
        boolean boolean6 = toStringStyle2.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle2.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer1, (java.lang.Object) boolean7);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
// flaky "77) test7150(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str12, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "78) test7151(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "28) test7151(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "16) test7151(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ",", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
// flaky "79) test7152(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "29) test7152(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldNameValueSeparator("]");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "80) test7153(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "81) test7154(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "30) test7154(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test7154(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
// flaky "6) test7154(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isUseFieldNames();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "82) test7155(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("{");
        toStringStyle0.setSizeStartText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("<null>");
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
// flaky "83) test7158(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
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
        toStringStyle0.setSizeStartText("");
        boolean boolean18 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "84) test7159(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        java.lang.String str11 = toStringStyle8.getArraySeparator();
        java.lang.String str12 = toStringStyle8.getContentEnd();
        boolean boolean13 = toStringStyle8.isDefaultFullDetail();
        boolean boolean14 = toStringStyle8.isDefaultFullDetail();
        java.lang.String str15 = toStringStyle8.getFieldNameValueSeparator();
        toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) toStringStyle8);
        toStringStyle8.setArrayStart("<size=");
        java.lang.String str19 = toStringStyle8.getArraySeparator();
        java.lang.StringBuffer stringBuffer20 = null;
        float[] floatArray28 = new float[] { '#', ' ', (short) 100, (-1), 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle8.appendSummary(stringBuffer20, ",", floatArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "85) test7160(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "]" + "'", str15, "]");
// flaky "31) test7160(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<size=" + "'", str19, "<size=");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 35.0f, 32.0f, 100.0f, (-1.0f), 1.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("hi!");
        boolean boolean15 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean16 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparator("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "hi!", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "86) test7163(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        boolean boolean12 = toStringStyle0.isUseClassName();
        java.lang.String str13 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str18 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "87) test7165(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str18, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayEnd("<null>");
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "88) test7166(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
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
        java.lang.String str16 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd(",");
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray21 = new double[] { (short) 10, 'a', (byte) 10, 10L, ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "=", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 97.0d, 10.0d, 10.0d, 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        toStringStyle0.setFieldNameValueSeparator("}");
        java.lang.String str15 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setArrayEnd("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setNullText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "89) test7173(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        java.lang.String str11 = toStringStyle8.getArraySeparator();
        java.lang.String str12 = toStringStyle8.getContentEnd();
        boolean boolean13 = toStringStyle8.isDefaultFullDetail();
        boolean boolean14 = toStringStyle8.isDefaultFullDetail();
        java.lang.String str15 = toStringStyle8.getFieldNameValueSeparator();
        toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) toStringStyle8);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str19 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer20 = null;
        float[] floatArray23 = new float[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "hi!", floatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        java.lang.String str11 = toStringStyle8.getArraySeparator();
        java.lang.String str12 = toStringStyle8.getContentEnd();
        boolean boolean13 = toStringStyle8.isDefaultFullDetail();
        boolean boolean14 = toStringStyle8.isDefaultFullDetail();
        java.lang.String str15 = toStringStyle8.getFieldNameValueSeparator();
        toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) toStringStyle8);
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "90) test7176(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(true);
        boolean boolean15 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray21 = new double[] { (byte) 10, 10.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "]", doubleArray21, (java.lang.Boolean) false);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setContentEnd(">");
        boolean boolean17 = toStringStyle11.isFullDetail((java.lang.Boolean) false);
        boolean boolean18 = toStringStyle11.isFieldSeparatorAtStart();
        toStringStyle11.setFieldNameValueSeparator("]");
        toStringStyle11.setArrayStart("]");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer9, "<size=", (java.lang.Object) toStringStyle11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "91) test7179(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendFieldStart(stringBuffer11, ">");
        toStringStyle0.setNullText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray19 = new short[] { (byte) 100, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "hi!", shortArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "92) test7181(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "32) test7181(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100, (short) 100, (short) 1 });
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        boolean boolean10 = toStringStyle0.isUseClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str13 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "93) test7182(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str12 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSummaryObjectStartText("hi!");
        java.lang.String str18 = toStringStyle15.getArraySeparator();
        java.lang.String str19 = toStringStyle15.getContentEnd();
        java.lang.String str20 = toStringStyle15.getSummaryObjectStartText();
        boolean boolean21 = toStringStyle15.isUseClassName();
        boolean boolean22 = toStringStyle15.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle15);
        java.lang.String str24 = toStringStyle15.getSummaryObjectStartText();
        toStringStyle15.setSizeEndText("<size=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer14, (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "94) test7183(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky "33) test7183(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str19, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = toStringStyle0.getContentStart();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentStart("<null>");
        java.lang.String str9 = toStringStyle0.getContentStart();
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("<size=");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", floatArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setContentStart("=");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "95) test7187(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "34) test7187(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectStartText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "96) test7188(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "35) test7188(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str7, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectEndText(",");
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        java.lang.String str11 = toStringStyle8.getArraySeparator();
        java.lang.String str12 = toStringStyle8.getContentEnd();
        boolean boolean13 = toStringStyle8.isDefaultFullDetail();
        boolean boolean14 = toStringStyle8.isDefaultFullDetail();
        java.lang.String str15 = toStringStyle8.getFieldNameValueSeparator();
        toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) toStringStyle8);
        toStringStyle8.setArrayStart("<size=");
        java.lang.String str19 = toStringStyle8.getArraySeparator();
        toStringStyle8.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer22 = null;
        int[] intArray30 = new int[] { (byte) 0, (short) 100, 0, (-1), (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle8.appendDetail(stringBuffer22, "ToStringStyle.NoFieldNameToStringStyle", intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, 100, 0, (-1), (-1), 1 });
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean11 = toStringStyle10.isUseShortClassName();
        java.lang.String str12 = toStringStyle10.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle10.appendSuper(stringBuffer13, ">");
        boolean boolean16 = toStringStyle10.isFieldSeparatorAtStart();
        toStringStyle10.setNullText("]");
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) toStringStyle10);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "97) test7192(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
// flaky "36) test7192(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap13 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", objMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test7196(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objMap13);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("<");
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "99) test7197(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.DefaultToStringStyle", byteArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "100) test7199(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "37) test7199(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText("<size=");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentEnd("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "101) test7201(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean15 = toStringStyle0.isArrayContentDetail();
        boolean boolean16 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray12 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", shortArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeStartText("<null>");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<null>", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setNullText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        toStringStyle0.setFieldNameValueSeparator("<");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray14 = new double[] { (short) 1, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 35.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ToStringStyle.SimpleToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getNullText();
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendSuper(stringBuffer11, "<");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = toStringStyle0.isUseClassName();
        toStringStyle0.setNullText("}");
        boolean boolean12 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setSummaryObjectStartText("hi!");
        toStringStyle16.setFieldSeparatorAtEnd(false);
        boolean boolean21 = toStringStyle16.isUseFieldNames();
        boolean boolean23 = toStringStyle16.isFullDetail((java.lang.Boolean) true);
        java.lang.String str24 = toStringStyle16.getArraySeparator();
        toStringStyle16.setSummaryObjectEndText(">");
        toStringStyle0.appendClassName(stringBuffer15, (java.lang.Object) ">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeStartText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str3 = toStringStyle0.getSizeStartText();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setFieldNameValueSeparator("}");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
// flaky "102) test7212(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "38) test7212(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSummaryObjectStartText("hi!");
        java.lang.String str14 = toStringStyle11.getArraySeparator();
        java.lang.String str15 = toStringStyle11.getContentEnd();
        java.lang.String str16 = toStringStyle11.getSummaryObjectStartText();
        boolean boolean17 = toStringStyle11.isUseClassName();
        boolean boolean18 = toStringStyle11.isUseShortClassName();
        toStringStyle11.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) toStringStyle11);
        toStringStyle11.setFieldSeparatorAtEnd(false);
        java.lang.String str24 = toStringStyle11.getFieldSeparator();
        java.lang.String str25 = toStringStyle11.getArraySeparator();
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle11.append(stringBuffer26, ",", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test7213(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "39) test7213(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
// flaky "18) test7213(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky "7) test7213(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{" + "'", str25, "{");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean8 = toStringStyle7.isUseShortClassName();
        boolean boolean9 = toStringStyle7.isUseIdentityHashCode();
        toStringStyle7.setNullText("]");
        toStringStyle7.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle7);
        toStringStyle7.setSizeEndText("]");
        toStringStyle7.setSizeEndText("=");
// flaky "104) test7214(org.apache.commons.lang3.builder.RegressionTest14)":         toStringStyle0.appendIdentityHashCode(stringBuffer6, (java.lang.Object) "=");
        java.lang.String str20 = toStringStyle0.getFieldSeparator();
        java.lang.String str21 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "40) test7214(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str20, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "19) test7214(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str21, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { (short) 10, (short) 10, (-1), (byte) 100, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "105) test7215(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "41) test7215(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "20) test7215(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "8) test7215(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 10L, 10L, (-1L), 100L, 0L, (-1L) });
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setContentEnd("]");
        boolean boolean16 = toStringStyle0.isUseClassName();
        boolean boolean17 = toStringStyle0.isArrayContentDetail();
        java.lang.String str18 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test7216(org.apache.commons.lang3.builder.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }
}
