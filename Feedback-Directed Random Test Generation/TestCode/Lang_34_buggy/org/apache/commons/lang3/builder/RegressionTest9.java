package org.apache.commons.lang3.builder;

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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setArrayEnd("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "]", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "1) test4501(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray21 = new float[] { 10, (short) 1, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "hi!", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test4502(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "1) test4502(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "1) test4502(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f, 1.0f, 0.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray17 = new int[] { 10, (byte) 10, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "]", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "3) test4503(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 1, 1 });
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSummaryObjectStartText("hi!");
        toStringStyle9.setFieldSeparatorAtEnd(false);
        toStringStyle9.setUseIdentityHashCode(true);
        toStringStyle9.setSizeStartText(",");
        java.lang.String str18 = toStringStyle9.getSummaryObjectEndText();
        java.lang.String str19 = toStringStyle9.getNullText();
        boolean boolean20 = toStringStyle9.isUseIdentityHashCode();
        java.lang.String str21 = toStringStyle9.getNullText();
        toStringStyle9.setSizeStartText("]");
        toStringStyle9.setUseIdentityHashCode(true);
        toStringStyle9.setNullText("<");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer7, "]", (java.lang.Object) "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "4) test4504(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "2) test4504(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "2) test4504(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str18, "ToStringStyle.SimpleToStringStyle");
// flaky "1) test4504(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "1) test4504(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object[] objArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "]", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test4505(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSummaryObjectStartText("hi!");
        boolean boolean18 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        java.lang.String str19 = toStringStyle14.getArraySeparator();
        toStringStyle14.setArrayContentDetail(true);
        java.lang.String str22 = toStringStyle14.getContentEnd();
        toStringStyle14.setSizeStartText(",");
        toStringStyle14.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        boolean boolean27 = toStringStyle14.isUseClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (java.lang.Object) toStringStyle14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "6) test4506(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "3) test4506(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "3) test4506(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "7) test4507(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.String str5 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray12 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "8) test4508(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "]" + "'", str5, "]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '4' });
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "]", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "9) test4509(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("=");
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
// flaky "10) test4510(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getArrayStart();
        boolean boolean7 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray14 = new int[] { (byte) -1, '4', ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.MultiLineToStringStyle", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "11) test4511(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 52, 32, (-1) });
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("<null>");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
// flaky "12) test4512(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "<size=");
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "[", byteArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test4513(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "4) test4513(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setSummaryObjectStartText("hi!");
        boolean boolean16 = toStringStyle12.isFullDetail((java.lang.Boolean) false);
        boolean boolean17 = toStringStyle12.isUseFieldNames();
        toStringStyle12.setArraySeparator("]");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer11, (java.lang.Object) "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "14) test4514(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray19 = new long[] { ' ', (byte) -1, 100, (-1L), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "[", longArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
// flaky "15) test4515(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 32L, (-1L), 100L, (-1L), (-1L) });
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeStartText("[");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray19 = new long[] { (short) 0, 1L, (byte) 100, (short) 0, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "16) test4516(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "5) test4516(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 0L, 1L, 100L, 0L, 0L, 100L });
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "{", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "17) test4517(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setContentStart("ToStringStyle.NoFieldNameToStringStyle");
        java.lang.String str12 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray17 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, ">", charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', ' ' });
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setSizeEndText("[");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "18) test4519(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
// flaky "6) test4519(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "]" + "'", str5, "]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "19) test4520(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("}");
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.ShortPrefixToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayEnd("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean13 = toStringStyle12.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        java.lang.String str15 = toStringStyle12.getSummaryObjectEndText();
        boolean boolean16 = toStringStyle12.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer11, (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
// flaky "20) test4523(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayStart("{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ">", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test4524(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "7) test4524(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = toStringStyle0.isUseClassName();
        toStringStyle0.setNullText("}");
        toStringStyle0.setUseClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "]" + "'", str5, "]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSizeStartText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "22) test4526(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "8) test4526(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "4) test4526(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray17 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "}", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        toStringStyle9.setContentEnd("");
        toStringStyle9.setArrayContentDetail(false);
        java.lang.String str16 = toStringStyle9.getSummaryObjectStartText();
        java.lang.String str17 = toStringStyle9.getArrayStart();
        toStringStyle9.setFieldSeparator("hi!");
        toStringStyle9.setContentStart(">");
        java.lang.String str22 = toStringStyle9.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "]", (java.lang.Object) toStringStyle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test4528(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "9) test4528(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str17, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        toStringStyle0.setSizeStartText("}");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, ">", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray14 = new long[] { ' ', (byte) 100, (byte) 10, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", longArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 32L, 100L, 10L, 100L, 35L });
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setUseFieldNames(true);
        boolean boolean17 = toStringStyle13.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str13 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        boolean boolean13 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "]", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "24) test4535(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "10) test4535(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "5) test4535(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.String str7 = toStringStyle0.getFieldSeparator();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "25) test4536(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "11) test4536(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "6) test4536(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "2) test4536(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "=", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "26) test4537(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
// flaky "27) test4538(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "12) test4538(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "7) test4538(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test4539(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "13) test4539(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer3 = null;
        int[] intArray10 = new int[] { (short) -1, '#', (byte) 0, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "", intArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 35, 0, 1, 0 });
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("=");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "29) test4541(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "14) test4541(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "30) test4542(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setUseClassName(false);
        toStringStyle10.setNullText("");
        toStringStyle10.setArrayContentDetail(true);
        toStringStyle10.setArraySeparator("");
        java.lang.String str19 = toStringStyle10.getArraySeparator();
        toStringStyle10.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle10.setNullText("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "31) test4544(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
// flaky "32) test4546(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isUseClassName();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str15 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "33) test4547(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer5, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentEnd("");
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setSummaryObjectStartText("<");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "}", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "34) test4549(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "15) test4549(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentStart("hi!");
        toStringStyle0.setArrayEnd("<");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "<size=", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test4550(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        boolean boolean2 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "]", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setContentEnd("");
        toStringStyle11.setArrayContentDetail(false);
        java.lang.String str18 = toStringStyle11.getNullText();
        boolean boolean19 = toStringStyle11.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle11);
        toStringStyle11.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
// flaky "36) test4552(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer24 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean26 = toStringStyle25.isUseShortClassName();
        toStringStyle25.setUseFieldNames(true);
        boolean boolean29 = toStringStyle25.isArrayContentDetail();
        toStringStyle25.setArraySeparator(",");
        boolean boolean32 = toStringStyle25.isUseShortClassName();
// flaky "16) test4552(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendClassName(stringBuffer24, (java.lang.Object) boolean32);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "[", booleanArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true });
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray16 = new long[] { (short) 100, 10L, 0L, 100, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "ToStringStyle.MultiLineToStringStyle", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 100L, 10L, 0L, 100L, 1L, 1L });
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldNameValueSeparator("=");
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "37) test4555(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "38) test4556(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
// flaky "17) test4556(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray13 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.SimpleToStringStyle", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray15 = new char[] { ' ', ' ', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "39) test4559(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ', ' ', ' ', '#' });
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "40) test4560(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", objMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        java.lang.String str14 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer17, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
// flaky "41) test4562(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, "");
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray17 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", booleanArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false, true, true, true });
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str12 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean16 = toStringStyle15.isFieldSeparatorAtEnd();
        java.lang.String str17 = toStringStyle15.getSummaryObjectEndText();
        boolean boolean18 = toStringStyle15.isArrayContentDetail();
        toStringStyle15.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str21 = toStringStyle15.getArrayStart();
        toStringStyle15.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle15.appendToString(stringBuffer24, "<");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer13, "", (java.lang.Object) "<", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str17, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str21, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "42) test4566(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objMap13);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("=");
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer20 = null;
        long[] longArray25 = new long[] { '#', (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "hi!", longArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 35L, 10L, 1L });
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ">", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "43) test4568(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray15 = new char[] { '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "44) test4569(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "18) test4569(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "8) test4569(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', ' ' });
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.String str9 = toStringStyle0.getContentStart();
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        java.lang.String str15 = toStringStyle13.getNullText();
        boolean boolean16 = toStringStyle13.isFieldSeparatorAtEnd();
        toStringStyle13.setFieldNameValueSeparator("");
        toStringStyle13.setDefaultFullDetail(false);
        toStringStyle13.setArrayContentDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean24 = toStringStyle23.isFieldSeparatorAtStart();
        toStringStyle23.setDefaultFullDetail(true);
        boolean boolean27 = toStringStyle23.isFieldSeparatorAtStart();
        toStringStyle23.setSizeStartText("hi!");
        java.lang.String str30 = toStringStyle23.getContentStart();
        toStringStyle23.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle33.setFieldNameValueSeparator("hi!");
        boolean boolean37 = toStringStyle33.isFullDetail((java.lang.Boolean) true);
        toStringStyle33.setSummaryObjectStartText("<null>");
        toStringStyle33.setFieldNameValueSeparator("hi!");
        toStringStyle33.setSizeStartText("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle44 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle44.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer47 = null;
        toStringStyle44.appendSuper(stringBuffer47, "hi!");
        boolean boolean50 = toStringStyle44.isArrayContentDetail();
        boolean boolean51 = toStringStyle44.isFieldSeparatorAtStart();
        boolean boolean52 = toStringStyle44.isDefaultFullDetail();
        java.lang.String str53 = toStringStyle44.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle54 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle54.setFieldNameValueSeparator("hi!");
        toStringStyle54.setArrayEnd(">");
        boolean boolean59 = toStringStyle54.isFieldSeparatorAtEnd();
        java.lang.Object[] objArray60 = new java.lang.Object[] { toStringStyle13, "ToStringStyle.SimpleToStringStyle", "", toStringStyle44, boolean59 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", objArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "19) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
// flaky "45) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringStyle23);
// flaky "9) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "3) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(toStringStyle44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
// flaky "2) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "1) test4570(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "]" + "'", str53, "]");
        org.junit.Assert.assertNotNull(toStringStyle54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "}", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText("");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayEnd(",");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle16.setUseClassName(false);
        toStringStyle16.setNullText("");
        toStringStyle16.setArrayContentDetail(true);
        toStringStyle16.setArraySeparator("");
        boolean boolean25 = toStringStyle16.isUseShortClassName();
        toStringStyle16.setArraySeparator("");
        toStringStyle16.setSizeEndText("{");
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setFieldNameValueSeparator("hi!");
        boolean boolean35 = toStringStyle31.isFullDetail((java.lang.Boolean) true);
        toStringStyle31.setSummaryObjectStartText("<null>");
        java.lang.String str38 = toStringStyle31.getNullText();
        java.lang.String str39 = toStringStyle31.getArraySeparator();
        toStringStyle16.appendClassName(stringBuffer30, (java.lang.Object) toStringStyle31);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle16);
// flaky "46) test4573(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str39, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparator("<null>");
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean13 = toStringStyle12.isUseShortClassName();
        java.lang.String str14 = toStringStyle12.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle12);
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle17.setSizeEndText("");
// flaky "47) test4574(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle12.appendClassName(stringBuffer16, (java.lang.Object) "");
        toStringStyle0.appendIdentityHashCode(stringBuffer11, (java.lang.Object) stringBuffer16);
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle23.setSummaryObjectStartText("hi!");
        java.lang.String str26 = toStringStyle23.getArraySeparator();
        java.lang.String str27 = toStringStyle23.getArraySeparator();
        toStringStyle23.setArraySeparator("[");
        java.lang.String str30 = toStringStyle23.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer22, (java.lang.Object) toStringStyle23);
// flaky "20) test4574(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "10) test4574(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertNotNull(toStringStyle23);
// flaky "4) test4574(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "3) test4574(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "," + "'", str30, ",");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray18 = new float[] { (-1.0f), (byte) -1, 100.0f, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", floatArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test4575(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { (-1.0f), (-1.0f), 100.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer13, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "49) test4576(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "21) test4576(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean17 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "50) test4578(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeStartText("{");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer8, "{");
// flaky "51) test4579(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "22) test4579(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle18.setSizeEndText("");
        toStringStyle18.setContentEnd("");
        toStringStyle18.setArrayContentDetail(false);
        java.lang.String str25 = toStringStyle18.getNullText();
        boolean boolean26 = toStringStyle18.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle18);
        toStringStyle18.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle18.setFieldSeparator("<");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ",", (java.lang.Object) "<", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "52) test4580(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setUseClassName(false);
        toStringStyle13.setNullText("");
        toStringStyle13.setArrayContentDetail(true);
        toStringStyle13.setUseClassName(false);
        java.lang.String str22 = toStringStyle13.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle24.setSummaryObjectStartText("hi!");
        java.lang.String str27 = toStringStyle24.getArraySeparator();
        java.lang.String str28 = toStringStyle24.getContentEnd();
        java.lang.String str29 = toStringStyle24.getSummaryObjectStartText();
        boolean boolean30 = toStringStyle24.isUseClassName();
        boolean boolean31 = toStringStyle24.isUseShortClassName();
        toStringStyle24.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle13.appendClassName(stringBuffer23, (java.lang.Object) toStringStyle24);
        toStringStyle24.setFieldSeparatorAtEnd(false);
        boolean boolean37 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle24);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) toStringStyle24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle24);
// flaky "23) test4581(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str27, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky "53) test4581(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray21 = new long[] { (short) 100, 10, 10, 'a', 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<null>", longArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 100L, 10L, 10L, 97L, 0L, (-1L) });
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "24) test4583(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "11) test4583(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setArrayEnd("<size=");
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        toStringStyle9.setContentEnd("");
        toStringStyle9.setArrayContentDetail(false);
        java.lang.String str16 = toStringStyle9.getNullText();
        boolean boolean17 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean20 = toStringStyle9.isDefaultFullDetail();
        toStringStyle9.setNullText("]");
        toStringStyle9.setUseIdentityHashCode(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean26 = toStringStyle25.isUseShortClassName();
        toStringStyle25.setArraySeparator("[");
        toStringStyle25.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle31.setFieldNameValueSeparator("hi!");
        java.lang.String str34 = toStringStyle31.getContentStart();
        toStringStyle31.setSummaryObjectStartText("");
        toStringStyle31.setUseClassName(true);
        toStringStyle31.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle31.setFieldSeparatorAtStart(true);
        toStringStyle31.setUseShortClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str46 = toStringStyle45.getSummaryObjectStartText();
        toStringStyle45.setUseClassName(false);
        java.lang.StringBuffer stringBuffer49 = null;
        toStringStyle45.appendToString(stringBuffer49, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str52 = toStringStyle45.getSummaryObjectEndText();
        boolean boolean53 = toStringStyle45.isArrayContentDetail();
        boolean boolean55 = toStringStyle45.isFullDetail((java.lang.Boolean) false);
        java.lang.String str56 = toStringStyle45.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle57 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean58 = toStringStyle57.isUseShortClassName();
        toStringStyle57.setUseFieldNames(true);
        boolean boolean61 = toStringStyle57.isArrayContentDetail();
        toStringStyle57.setArraySeparator(",");
        toStringStyle57.setContentEnd("");
        java.lang.Object[] objArray66 = new java.lang.Object[] { false, toStringStyle25, true, str56, "" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "<null>", objArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "54) test4584(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "25) test4584(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "]" + "'", str6, "]");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str34, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle45);
// flaky "12) test4584(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<null>" + "'", str46, "<null>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str52, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str56, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle4.setSizeEndText("");
        toStringStyle4.setContentEnd(">");
        boolean boolean10 = toStringStyle4.isFullDetail((java.lang.Boolean) false);
        java.lang.String str11 = toStringStyle4.getSummaryObjectStartText();
        toStringStyle4.setContentStart(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer2, "}", (java.lang.Object) toStringStyle4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "55) test4585(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str1, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayStart("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, ",", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "56) test4587(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray15 = new double[] { 100.0d, 10.0d, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.SimpleToStringStyle", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ",", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true, false, false, true });
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSummaryObjectStartText("hi!");
        java.lang.String str10 = toStringStyle7.getArraySeparator();
        java.lang.String str11 = toStringStyle7.getContentEnd();
        java.lang.String str12 = toStringStyle7.getSummaryObjectStartText();
        java.lang.String str13 = toStringStyle7.getNullText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer5, "{", (java.lang.Object) str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "57) test4592(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "26) test4592(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "13) test4592(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        toStringStyle0.setFieldSeparator("<");
        boolean boolean18 = toStringStyle0.isArrayContentDetail();
        java.lang.String str19 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "58) test4594(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str12 = toStringStyle11.getFieldSeparator();
        java.lang.Class<?> wildcardClass13 = toStringStyle11.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        java.lang.String str17 = toStringStyle14.getContentStart();
        toStringStyle14.setArrayContentDetail(false);
        java.lang.String str20 = toStringStyle14.getSizeEndText();
        toStringStyle14.setNullText("");
        java.lang.Object[] objArray23 = new java.lang.Object[] { wildcardClass13, toStringStyle14 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "]", objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "59) test4595(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str17, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str20, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "60) test4597(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
// flaky "27) test4597(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "14) test4597(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean6 = toStringStyle5.isUseShortClassName();
        boolean boolean7 = toStringStyle5.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        java.lang.String str10 = toStringStyle5.getArraySeparator();
        toStringStyle5.setSizeEndText(">");
        java.lang.String str13 = toStringStyle5.getArrayEnd();
        boolean boolean14 = toStringStyle5.isUseClassName();
        toStringStyle5.setNullText("}");
        boolean boolean17 = toStringStyle5.isUseClassName();
        toStringStyle5.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean20 = toStringStyle5.isUseShortClassName();
        toStringStyle5.setFieldSeparatorAtStart(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer4, (java.lang.Object) toStringStyle5);
// flaky "61) test4598(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "28) test4598(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "62) test4600(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray9 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "<", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "63) test4602(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "29) test4602(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a' });
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str6 = toStringStyle0.getArrayEnd();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray13 = new short[] { (short) -1, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<", shortArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "64) test4603(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "30) test4603(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<" + "'", str6, "<");
// flaky "15) test4603(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) -1, (short) -1, (short) 0 });
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer16, "=", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
// flaky "65) test4604(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<" + "'", str11, "<");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.String str11 = toStringStyle8.getContentStart();
        java.lang.String str12 = toStringStyle8.getSizeEndText();
        java.lang.String str13 = toStringStyle8.getArraySeparator();
        toStringStyle8.setNullText("{");
        java.lang.String str16 = toStringStyle8.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("hi!");
        java.lang.String str20 = toStringStyle17.getContentStart();
        toStringStyle17.setSummaryObjectStartText("");
        toStringStyle17.setUseClassName(true);
        toStringStyle17.setNullText("[");
        java.lang.String str27 = toStringStyle17.getSummaryObjectStartText();
        toStringStyle17.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.Class<?> wildcardClass30 = toStringStyle17.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle31.setSummaryObjectStartText("hi!");
        toStringStyle31.setFieldSeparatorAtEnd(false);
        toStringStyle31.setUseIdentityHashCode(true);
        toStringStyle31.setSizeStartText(",");
        java.lang.String str40 = toStringStyle31.getSummaryObjectEndText();
        java.lang.String str41 = toStringStyle31.getNullText();
        boolean boolean42 = toStringStyle31.isUseIdentityHashCode();
        java.lang.String str43 = toStringStyle31.getNullText();
        toStringStyle31.setFieldSeparatorAtStart(false);
        java.lang.String str46 = toStringStyle31.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle47.setSizeEndText("");
        toStringStyle47.setContentEnd("");
        java.lang.String str52 = toStringStyle47.getSizeEndText();
        toStringStyle47.setFieldSeparator("");
        toStringStyle47.setUseFieldNames(true);
        java.lang.String str57 = toStringStyle47.getSizeStartText();
        java.lang.StringBuffer stringBuffer58 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle59 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle59.setFieldNameValueSeparator("hi!");
        java.lang.String str62 = toStringStyle59.getContentStart();
        toStringStyle59.setArrayContentDetail(false);
        boolean boolean66 = toStringStyle59.isFullDetail((java.lang.Boolean) false);
        toStringStyle47.appendClassName(stringBuffer58, (java.lang.Object) toStringStyle59);
        java.lang.StringBuffer stringBuffer68 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle69 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle69.setUseClassName(false);
        java.lang.StringBuffer stringBuffer72 = null;
        toStringStyle69.appendSuper(stringBuffer72, ">");
        toStringStyle59.appendStart(stringBuffer68, (java.lang.Object) stringBuffer72);
        java.lang.Object[] objArray76 = new java.lang.Object[] { str16, toStringStyle17, toStringStyle31, toStringStyle59 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "}", objArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str20, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str40, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "]" + "'", str41, "]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "]" + "'", str43, "]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "," + "'", str57, ",");
        org.junit.Assert.assertNotNull(toStringStyle59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str62, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(toStringStyle69);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "66) test4606(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "31) test4606(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<size=" + "'", str2, "<size=");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("{");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        boolean boolean18 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayEnd("<null>");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle11.setFieldNameValueSeparator("hi!");
        java.lang.String str14 = toStringStyle11.getContentStart();
        java.lang.String str15 = toStringStyle11.getContentStart();
        java.lang.String str16 = toStringStyle11.getArrayStart();
        toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) str16);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "67) test4611(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "32) test4611(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "]", byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "68) test4612(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "33) test4612(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setSizeEndText(",");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.DefaultToStringStyle", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test4614(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.String str11 = toStringStyle8.getContentStart();
        toStringStyle8.setSummaryObjectStartText("");
        toStringStyle8.setUseClassName(true);
        toStringStyle8.setNullText("[");
        toStringStyle8.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str20 = toStringStyle8.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer6, "{", (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "70) test4616(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray16 = new long[] { (byte) 100, (short) 0, '#', 0, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 100L, 0L, 35L, 0L, 0L, (-1L) });
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str15 = toStringStyle14.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, "[", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "71) test4619(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setFieldNameValueSeparator("hi!");
        java.lang.String str10 = toStringStyle7.getContentStart();
        toStringStyle7.setArrayContentDetail(false);
        java.lang.String str13 = toStringStyle7.getSizeEndText();
        toStringStyle7.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str16 = toStringStyle7.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) str16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "72) test4620(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str16, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle19.setSummaryObjectStartText("hi!");
        boolean boolean23 = toStringStyle19.isFullDetail((java.lang.Boolean) false);
        toStringStyle19.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str26 = toStringStyle19.getSummaryObjectEndText();
        toStringStyle19.setContentEnd(">");
        java.lang.String str29 = toStringStyle19.getArrayEnd();
        java.lang.String str30 = toStringStyle19.getSummaryObjectEndText();
        java.lang.String str31 = toStringStyle19.getArrayStart();
        java.lang.Class<?> wildcardClass32 = toStringStyle19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer17, "", (java.lang.Object) toStringStyle19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "73) test4621(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str26, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<null>" + "'", str29, "<null>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str30, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "34) test4621(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "=" + "'", str31, "=");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArraySeparator("]");
        toStringStyle0.setContentStart(">");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray18 = new int[] { (byte) 1, (short) -1, ' ', (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "}", intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, (-1), 32, 0, 1, 10 });
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparator("hi!");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.String str10 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.DefaultToStringStyle", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
// flaky "74) test4625(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        boolean boolean14 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray20 = new short[] { (short) -1, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", shortArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "75) test4626(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "]" + "'", str5, "]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) -1, (short) 10, (short) 100 });
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setArraySeparator("=");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "76) test4627(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<" + "'", str3, "<");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        java.lang.String str17 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparator("}");
        java.lang.StringBuffer stringBuffer20 = null;
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer20, "", byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "77) test4628(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "hi!", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldNameValueSeparator("<size=");
        java.lang.String str11 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "78) test4630(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "79) test4631(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray9 = new float[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "=", floatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "80) test4634(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getContentStart();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("]");
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.String str15 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer16 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap18 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "}", objMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "81) test4637(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objMap18);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        boolean boolean15 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str16 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "82) test4639(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "35) test4639(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str16, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray9 = new long[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.DefaultToStringStyle", longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
// flaky "83) test4640(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "36) test4640(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { (-1L) });
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray21 = new double[] { 100.0d, 100, 100.0d, (byte) 100, (byte) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<null>", doubleArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d, 100.0d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "84) test4643(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "37) test4643(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setFieldNameValueSeparator("hi!");
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) true);
        toStringStyle5.setSummaryObjectStartText("<null>");
        java.lang.String str12 = toStringStyle5.getNullText();
        boolean boolean13 = toStringStyle5.isUseShortClassName();
        java.lang.String str14 = toStringStyle5.getArrayStart();
        toStringStyle5.setSummaryObjectEndText("<");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer4, (java.lang.Object) "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer10, "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "<size=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "85) test4647(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<" + "'", str6, "<");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getArrayStart();
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayStart("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "86) test4649(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "38) test4649(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<size=", byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setUseClassName(false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", objArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test4652(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setArrayEnd(",");
        boolean boolean13 = toStringStyle10.isDefaultFullDetail();
        java.lang.String str14 = toStringStyle10.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "{", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "88) test4653(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "39) test4653(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<" + "'", str14, "<");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, ",", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<" + "'", str9, "<");
// flaky "89) test4654(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "40) test4654(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setArraySeparator("");
        java.lang.String str15 = toStringStyle12.getContentStart();
        boolean boolean16 = toStringStyle12.isDefaultFullDetail();
        java.lang.String str17 = toStringStyle12.getArrayEnd();
        toStringStyle12.setSizeStartText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer10, ">", (java.lang.Object) toStringStyle12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
// flaky "90) test4655(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        java.lang.String str16 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<" + "'", str9, "<");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "91) test4656(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray15 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "=", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "92) test4657(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true });
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray10 = new short[] { (short) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.MultiLineToStringStyle", shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "93) test4658(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) -1, (short) 10, (short) 100 });
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
// flaky "94) test4660(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendToString(stringBuffer9, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "41) test4660(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean2 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "95) test4661(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "42) test4661(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        boolean boolean24 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle11);
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle11.appendContentStart(stringBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "96) test4662(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "43) test4662(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "16) test4662(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "5) test4662(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean7 = toStringStyle6.isFieldSeparatorAtEnd();
        java.lang.String str8 = toStringStyle6.getSummaryObjectEndText();
        toStringStyle6.setNullText("");
        boolean boolean11 = toStringStyle6.isUseClassName();
        java.lang.Object[] objArray12 = new java.lang.Object[] { toStringStyle6 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "]", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "97) test4663(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray16 = new boolean[] { true, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", booleanArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, true, true, false, false });
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle8.appendDetail(stringBuffer17, "", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "98) test4665(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "99) test4666(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer13, "[");
// flaky "100) test4667(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "44) test4667(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray14 = new short[] { (short) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 10, (short) 100 });
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean13 = toStringStyle12.isUseShortClassName();
        boolean boolean14 = toStringStyle12.isUseIdentityHashCode();
        boolean boolean16 = toStringStyle12.isFullDetail((java.lang.Boolean) false);
        java.lang.String str17 = toStringStyle12.getArraySeparator();
        toStringStyle12.setSizeEndText(">");
        java.lang.String str20 = toStringStyle12.getSizeStartText();
        java.lang.String str21 = toStringStyle12.getSizeStartText();
        boolean boolean22 = toStringStyle12.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer23 = null;
// flaky "101) test4669(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle12.appendToString(stringBuffer23, "<null>");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer10, "}", (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "45) test4669(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky "17) test4669(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "102) test4670(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "]" + "'", str6, "]");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setContentStart("");
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray17 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "hi!", charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test4672(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "46) test4672(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "18) test4672(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText("");
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray8 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "{", shortArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "104) test4673(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 10 });
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSummaryObjectEndText("{");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "105) test4674(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test4675(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setUseFieldNames(false);
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getContentStart();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSummaryObjectStartText("{");
        java.lang.String str13 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "107) test4678(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("{");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer8, "{");
// flaky "108) test4679(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "47) test4679(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
// flaky "19) test4679(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) str8);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "109) test4680(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer8, "<null>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray14 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.String str13 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<size=");
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer17 = null;
        double[] doubleArray24 = new double[] { 100.0f, (byte) 10, 10L, 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.ShortPrefixToStringStyle", doubleArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "110) test4683(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 10.0d, 10.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray19 = new long[] { 1, (short) 10, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.DefaultToStringStyle", longArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L, 10L, 10L, 1L });
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str8 = toStringStyle0.getContentStart();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
// flaky "111) test4685(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "]" + "'", str6, "]");
// flaky "48) test4685(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray19 = new char[] { 'a', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "112) test4686(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "49) test4686(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "20) test4686(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '4', '4', 'a' });
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
// flaky "113) test4687(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
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
        toStringStyle0.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "<size=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
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
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "114) test4689(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ">", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSummaryObjectStartText("hi!");
        toStringStyle6.setFieldSeparatorAtEnd(false);
        toStringStyle6.setUseIdentityHashCode(true);
        toStringStyle6.setSizeStartText(",");
        boolean boolean15 = toStringStyle6.isArrayContentDetail();
        boolean boolean16 = toStringStyle6.isUseIdentityHashCode();
        boolean boolean17 = toStringStyle6.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer4, "}", (java.lang.Object) boolean17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("]");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer8, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer4 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "<null>", objMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
// flaky "115) test4694(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objMap6);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean19 = toStringStyle18.isFieldSeparatorAtEnd();
        java.lang.String str20 = toStringStyle18.getSummaryObjectEndText();
        toStringStyle18.setNullText("");
        toStringStyle18.setContentStart(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer16, "<size=", (java.lang.Object) toStringStyle18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "]" + "'", str20, "]");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean12 = toStringStyle11.isDefaultFullDetail();
        toStringStyle11.setSizeStartText("<size=");
        toStringStyle11.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "]", (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "116) test4696(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "50) test4696(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray8 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "{", shortArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] {});
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText("");
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setContentStart(",");
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "117) test4700(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSizeStartText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray15 = new long[] { 1L, (short) 1, (byte) 0, (short) 10, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "]", longArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "118) test4701(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "51) test4701(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 1L, 1L, 0L, 10L, 35L, 100L });
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseShortClassName(false);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { 10L, 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "]", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 10L, 10L, 100L });
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray16 = new int[] { (short) 1, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", intArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 32, 32 });
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendFieldStart(stringBuffer5, ">");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSizeStartText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "119) test4705(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray13 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "120) test4706(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "52) test4706(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', '4' });
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "121) test4707(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayStart("}");
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray15 = new boolean[] { false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "122) test4708(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<" + "'", str3, "<");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "53) test4708(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str5, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true, false, false, true });
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("{");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getContentStart();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.SimpleToStringStyle", objArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean9 = toStringStyle0.isUseClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
// flaky "123) test4711(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendFieldStart(stringBuffer11, ">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.String str12 = toStringStyle0.getNullText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str15 = toStringStyle0.getContentStart();
        toStringStyle0.setContentEnd("ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.setSizeEndText("<");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "{", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "124) test4712(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
// flaky "54) test4712(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str11, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object[] objArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean16 = toStringStyle15.isFieldSeparatorAtStart();
        toStringStyle15.setDefaultFullDetail(true);
        boolean boolean19 = toStringStyle15.isFieldSeparatorAtStart();
        toStringStyle15.setSizeStartText("hi!");
        java.lang.String str22 = toStringStyle15.getContentStart();
        toStringStyle15.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.appendIdentityHashCode(stringBuffer14, (java.lang.Object) "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "125) test4714(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "55) test4714(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "21) test4714(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test4714(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "4) test4714(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str3 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer4, "ToStringStyle.MultiLineToStringStyle", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("<null>");
        toStringStyle0.setContentEnd("{");
        toStringStyle0.setArrayEnd("hi!");
        boolean boolean15 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "126) test4716(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("=");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray18 = new float[] { (short) 100, (-1L), (byte) 1, 0.0f, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 100.0f, (-1.0f), 1.0f, 0.0f, (-1.0f), 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "127) test4718(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparator("=");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray17 = new int[] { '#', (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "128) test4720(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "56) test4720(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, (-1), (-1) });
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart("=");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer14, "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "129) test4721(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeStartText("");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "130) test4722(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentStart("hi!");
        toStringStyle0.setArrayEnd("<");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "{", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        toStringStyle13.setFieldSeparatorAtEnd(false);
        toStringStyle13.setUseIdentityHashCode(true);
        toStringStyle13.setSizeStartText(",");
        java.lang.String str22 = toStringStyle13.getSummaryObjectEndText();
        java.lang.String str23 = toStringStyle13.getNullText();
        toStringStyle13.setNullText("<null>");
        toStringStyle13.setNullText("{");
        toStringStyle0.appendClassName(stringBuffer12, (java.lang.Object) "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "131) test4724(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "57) test4724(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
// flaky "22) test4724(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle8.appendSuper(stringBuffer11, "hi!");
        boolean boolean14 = toStringStyle8.isArrayContentDetail();
        java.lang.String str15 = toStringStyle8.getArraySeparator();
        toStringStyle8.setFieldNameValueSeparator("<null>");
        boolean boolean18 = toStringStyle8.isUseClassName();
        toStringStyle8.setUseFieldNames(true);
        java.lang.String str21 = toStringStyle8.getArraySeparator();
        java.lang.String str22 = toStringStyle8.getFieldSeparator();
        java.lang.Class<?> wildcardClass23 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle24.setFieldNameValueSeparator("hi!");
        java.lang.String str27 = toStringStyle24.getContentStart();
        java.lang.String str28 = toStringStyle24.getSizeEndText();
        toStringStyle24.setFieldSeparatorAtStart(false);
        java.lang.String str31 = toStringStyle24.getContentEnd();
        java.lang.String str32 = toStringStyle24.getSizeEndText();
        java.lang.String str33 = toStringStyle24.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle34 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle34.setSizeEndText("");
        toStringStyle34.setContentEnd("");
        toStringStyle34.setArrayContentDetail(false);
        java.lang.String str41 = toStringStyle34.getNullText();
        boolean boolean42 = toStringStyle34.isUseIdentityHashCode();
        toStringStyle34.setArrayContentDetail(false);
        java.lang.String str45 = toStringStyle34.getSizeEndText();
        boolean boolean46 = toStringStyle34.isUseClassName();
        java.lang.String str47 = toStringStyle34.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle48.setSummaryObjectStartText("hi!");
        toStringStyle48.setFieldSeparatorAtEnd(false);
        java.lang.String str53 = toStringStyle48.getSizeEndText();
        toStringStyle48.setArrayEnd("<size=");
        toStringStyle48.setContentEnd("=");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle58 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle58.setUseClassName(false);
        java.lang.StringBuffer stringBuffer61 = null;
        toStringStyle58.appendSuper(stringBuffer61, ">");
        java.lang.Object[] objArray64 = new java.lang.Object[] { toStringStyle8, str33, str47, toStringStyle48, ">" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "{", objArray64, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "132) test4725(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{" + "'", str21, "{");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "=" + "'", str22, "=");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str27, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str28, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str31, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str32, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(toStringStyle34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{" + "'", str41, "{");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(toStringStyle58);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "[", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer20 = null;
        float[] floatArray22 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "}", floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "133) test4727(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldNameValueSeparator("<size=");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "134) test4728(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray15 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.SimpleToStringStyle", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "135) test4729(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "58) test4729(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<size=", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "136) test4730(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
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
        toStringStyle0.setContentStart("hi!");
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<size=" + "'", str17, "<size=");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("[");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "137) test4732(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSizeStartText("");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean18 = toStringStyle17.isFieldSeparatorAtEnd();
        boolean boolean19 = toStringStyle17.isUseFieldNames();
        java.lang.String str20 = toStringStyle17.getSummaryObjectEndText();
        boolean boolean21 = toStringStyle17.isUseShortClassName();
        toStringStyle17.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean24 = toStringStyle17.isUseFieldNames();
        toStringStyle17.setFieldSeparator("<size=");
        toStringStyle17.setArraySeparator("<size=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer16, (java.lang.Object) "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<null>" + "'", str20, "<null>");
// flaky "138) test4733(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { 0L, 100, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "=", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L, 100L, 100L });
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "139) test4735(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "59) test4735(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.SimpleToStringStyle", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        java.lang.String str3 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray7 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "]", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "140) test4737(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
// flaky "141) test4738(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendSuper(stringBuffer15, "{");
        java.lang.String str18 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, ",", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "60) test4738(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle18.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle18.appendSuper(stringBuffer21, "hi!");
        boolean boolean24 = toStringStyle18.isArrayContentDetail();
        boolean boolean25 = toStringStyle18.isFieldSeparatorAtStart();
        boolean boolean26 = toStringStyle18.isDefaultFullDetail();
        boolean boolean27 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle18);
        java.lang.String str28 = toStringStyle18.getContentStart();
        toStringStyle18.setDefaultFullDetail(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", (java.lang.Object) true, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "142) test4739(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle18);
// flaky "61) test4739(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "23) test4739(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky "7) test4739(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str28, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
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
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str17 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer18 = null;
        char[] charArray20 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "<size=", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "143) test4740(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArrayStart("[");
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "144) test4741(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setSizeStartText("");
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str15 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.ShortPrefixToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayStart("<size=");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        java.lang.String str13 = toStringStyle10.getContentStart();
        toStringStyle10.setSummaryObjectStartText("");
        toStringStyle10.setUseClassName(true);
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle10.appendToString(stringBuffer18, "");
        java.lang.String str21 = toStringStyle10.getFieldNameValueSeparator();
        toStringStyle0.appendClassName(stringBuffer9, (java.lang.Object) toStringStyle10);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "145) test4743(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setNullText("ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "146) test4744(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        java.lang.String str15 = toStringStyle13.getSummaryObjectEndText();
        toStringStyle13.setUseShortClassName(true);
        boolean boolean18 = toStringStyle13.isArrayContentDetail();
        toStringStyle13.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<", (java.lang.Object) "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "147) test4745(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "62) test4745(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        boolean boolean2 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "148) test4746(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "63) test4746(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray17 = new long[] { ' ', (-1), 10, '#', 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.DefaultToStringStyle", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "149) test4747(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "64) test4747(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 32L, (-1L), 10L, 35L, 97L, 100L });
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setSummaryObjectEndText("<null>");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { (byte) 1, (short) 1, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, 1L, 1L, 1L });
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer14, obj15);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, ",", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray17 = new short[] { (short) -1, (short) 10, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, ">", shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "150) test4752(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) -1, (short) 10, (short) 10, (short) 1 });
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(false);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "151) test4753(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "65) test4753(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray18 = new float[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "{", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        java.lang.String str15 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<size=" + "'", str15, "<size=");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "152) test4757(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray10 = new long[] { 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, ",", longArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 1L, 10L });
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "153) test4759(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayStart("[");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray21 = new double[] { (-1L), (-1.0f), (short) 0, 100.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", doubleArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), (-1.0d), 0.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray16 = new float[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.DefaultToStringStyle", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
// flaky "154) test4761(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getNullText();
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "{", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayStart("{");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
// flaky "155) test4764(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setArraySeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "156) test4765(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", (float) (byte) 10);
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
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "[", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "157) test4767(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray12 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "]", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "158) test4768(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeStartText("<");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayStart("<size=");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "159) test4771(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
// flaky "160) test4772(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "{", obj13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "161) test4773(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "66) test4773(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayEnd("<null>");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.SimpleToStringStyle", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "162) test4775(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setArrayStart("<size=");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { '#', '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 35L, 52L, 0L });
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendToString(stringBuffer5, "ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.String str7 = toStringStyle0.getFieldSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "163) test4780(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "67) test4780(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "24) test4780(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "8) test4780(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "5) test4780(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSizeEndText("");
        toStringStyle13.setContentEnd("");
        toStringStyle13.setArrayContentDetail(false);
        java.lang.String str20 = toStringStyle13.getNullText();
        boolean boolean21 = toStringStyle13.isUseIdentityHashCode();
        toStringStyle13.setFieldNameValueSeparator("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "164) test4781(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<" + "'", str20, "<");
// flaky "68) test4781(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.Class<?> wildcardClass12 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "165) test4782(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "69) test4782(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
// flaky "25) test4782(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray16 = new long[] { 1, 0, (-1), 100L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "166) test4783(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, 0L, (-1L), 100L, 10L });
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "167) test4784(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
// flaky "70) test4784(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<null>", charArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "168) test4785(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', ' ' });
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer6, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText("<null>");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "169) test4787(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayEnd("<null>");
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentStart("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
            toStringStyle0.appendDetail(stringBuffer19, "ToStringStyle.SimpleToStringStyle", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "170) test4790(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "71) test4790(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "26) test4790(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setArrayEnd("]");
        toStringStyle0.setContentStart("}");
        java.lang.StringBuffer stringBuffer11 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap13 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "{", objMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objMap13);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", byteArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "171) test4793(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "72) test4793(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<size=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        boolean boolean17 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeEndText("}");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray18 = new double[] { 10, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "172) test4797(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "73) test4797(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
// flaky "27) test4797(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSizeEndText("");
        toStringStyle14.setContentEnd("");
        toStringStyle14.setArrayContentDetail(false);
        toStringStyle14.setFieldSeparator("<null>");
        boolean boolean23 = toStringStyle14.isFieldSeparatorAtEnd();
        java.lang.String str24 = toStringStyle14.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "173) test4798(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "74) test4798(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "174) test4799(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSummaryObjectStartText("hi!");
        toStringStyle6.setFieldSeparatorAtEnd(false);
        toStringStyle6.setUseIdentityHashCode(true);
        toStringStyle6.setSizeStartText(",");
        java.lang.String str15 = toStringStyle6.getSummaryObjectEndText();
        java.lang.String str16 = toStringStyle6.getNullText();
        toStringStyle6.setContentEnd(",");
        toStringStyle6.setDefaultFullDetail(true);
        boolean boolean21 = toStringStyle6.isFieldSeparatorAtStart();
        toStringStyle6.setSizeStartText(">");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = toStringStyle24.getSizeStartText();
        boolean boolean26 = toStringStyle24.isUseIdentityHashCode();
        toStringStyle24.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle29.setArraySeparator("");
        java.lang.String str32 = toStringStyle29.getContentStart();
        boolean boolean33 = toStringStyle29.isDefaultFullDetail();
        java.lang.String str34 = toStringStyle29.getArrayEnd();
        toStringStyle29.setDefaultFullDetail(true);
        java.lang.String str37 = toStringStyle29.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle38.setSizeEndText("");
        toStringStyle38.setContentEnd("");
        toStringStyle38.setArrayContentDetail(false);
        java.lang.String str45 = toStringStyle38.getNullText();
        boolean boolean46 = toStringStyle38.isUseIdentityHashCode();
        toStringStyle38.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean49 = toStringStyle38.isDefaultFullDetail();
        toStringStyle38.setNullText("]");
        java.lang.Object[] objArray52 = new java.lang.Object[] { toStringStyle6, toStringStyle24, toStringStyle29, toStringStyle38 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "{", objArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "175) test4800(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str15, "ToStringStyle.SimpleToStringStyle");
// flaky "75) test4800(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{" + "'", str25, "{");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "}" + "'", str32, "}");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "28) test4800(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "}" + "'", str37, "}");
        org.junit.Assert.assertNotNull(toStringStyle38);
// flaky "9) test4800(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str45, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
// flaky "176) test4801(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
// flaky "76) test4801(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { (byte) 10, (byte) 10, 10, ' ', (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "{", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 10L, 10L, 10L, 32L, 100L, (-1L) });
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setUseClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setArrayEnd(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setArraySeparator("<");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setContentStart("}");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray20 = new int[] { 1, (byte) 100, (-1), (short) 1, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "[", intArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 100, (-1), 1, 35, 97 });
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "177) test4808(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray13 = new float[] { 10.0f, 0, 100, (byte) 1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "ToStringStyle.DefaultToStringStyle", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 10.0f, 0.0f, 100.0f, 1.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getContentStart();
        java.lang.String str13 = toStringStyle0.getArrayEnd();
        java.lang.String str14 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray19 = new short[] { (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "<null>", shortArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) -1, (short) 0 });
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ">", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setNullText("");
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray18 = new float[] { 10L, 'a', 100L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ",", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 10.0f, 97.0f, 100.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        float[] floatArray15 = new float[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", floatArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray8 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("=");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, ",", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd(",");
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "=", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
// flaky "178) test4817(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "}", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
// flaky "179) test4818(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setContentStart("");
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        boolean boolean16 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "{");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle0.appendToString(stringBuffer20, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "<size=", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
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
        java.lang.String str14 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "180) test4822(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "77) test4822(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "[", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray9 = new float[] { '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "=", floatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "181) test4825(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 35.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("]");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "182) test4826(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "78) test4826(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSizeEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "hi!", charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, ",", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "183) test4830(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle4.setSummaryObjectStartText("hi!");
        toStringStyle4.setFieldSeparatorAtEnd(false);
        toStringStyle4.setUseIdentityHashCode(true);
        toStringStyle4.setSizeStartText(",");
        java.lang.String str13 = toStringStyle4.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle4.getNullText();
        toStringStyle4.setNullText("<null>");
        toStringStyle4.setNullText("{");
        toStringStyle4.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer3, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle4);
// flaky "184) test4831(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "79) test4831(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSummaryObjectStartText("{");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        boolean boolean7 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "185) test4833(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
// flaky "80) test4833(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str16 = toStringStyle0.getNullText();
        java.lang.String str17 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray25 = new boolean[] { false, true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.ShortPrefixToStringStyle", booleanArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<" + "'", str17, "<");
        org.junit.Assert.assertNotNull(booleanArray25);
        assertBooleanArrayEquals(booleanArray25, new boolean[] { false, true, true, false, true });
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseIdentityHashCode(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "186) test4835(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "187) test4836(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        int[] intArray5 = new int[] { (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer1, "]", intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 0 });
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "188) test4838(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
// flaky "189) test4839(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.DefaultToStringStyle", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "190) test4841(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "[", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "191) test4842(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean21 = toStringStyle20.isFieldSeparatorAtEnd();
        java.lang.String str22 = toStringStyle20.getNullText();
        boolean boolean23 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle20);
        toStringStyle20.setFieldNameValueSeparator("=");
        boolean boolean26 = toStringStyle20.isUseClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer18, "<null>", (java.lang.Object) toStringStyle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "192) test4843(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "]" + "'", str22, "]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        toStringStyle8.setFieldSeparatorAtEnd(false);
        toStringStyle8.setUseIdentityHashCode(true);
        toStringStyle8.setSizeStartText(",");
        boolean boolean17 = toStringStyle8.isUseIdentityHashCode();
        boolean boolean18 = toStringStyle8.isUseShortClassName();
        boolean boolean19 = toStringStyle8.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectEndText("");
        toStringStyle0.setArraySeparator(",");
        java.lang.String str16 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str17 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "193) test4846(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ">", floatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "194) test4848(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArraySeparator("}");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "195) test4851(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "81) test4851(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ">", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test4852(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getContentStart();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<", objMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNotNull(objMap9);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(false);
        boolean boolean12 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "197) test4854(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, "");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
// flaky "198) test4856(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "82) test4856(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray16 = new short[] { (short) 10, (short) 1, (short) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.MultiLineToStringStyle", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 1, (short) 1, (short) 1, (short) 10, (short) 100 });
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentStart("hi!");
        toStringStyle0.setArrayEnd("<");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray14 = new float[] { 100, '#', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", floatArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 100.0f, 35.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle14.setDefaultFullDetail(false);
        java.lang.String str17 = toStringStyle14.getSizeEndText();
        java.lang.String str18 = toStringStyle14.getSizeEndText();
        toStringStyle14.setSizeEndText("ToStringStyle.NoFieldNameToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "199) test4859(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "83) test4859(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "29) test4859(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "10) test4859(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean11 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "200) test4860(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getNullText();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("<");
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { (short) -1, 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "]", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "201) test4861(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<" + "'", str5, "<");
// flaky "84) test4861(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "30) test4861(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 1.0f, 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isArrayContentDetail();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        boolean boolean4 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.ShortPrefixToStringStyle", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
// flaky "202) test4863(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setSizeEndText(">");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
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
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "<", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray14 = new char[] { '#', '#', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '#', '#', '4' });
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeStartText("[");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("]");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectEndText("");
        boolean boolean14 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray23 = new double[] { '#', (short) 10, 100.0f, 'a', 100.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.DefaultToStringStyle", doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
// flaky "203) test4871(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "85) test4871(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d, 10.0d, 100.0d, 97.0d, 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "204) test4872(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "86) test4872(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "31) test4872(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "", objMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "205) test4873(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objMap6);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setContentStart("=");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "206) test4874(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "hi!", byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "207) test4875(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "}", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "208) test4877(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "87) test4877(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray17 = new float[] { (-1L), (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ">", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "209) test4878(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { (-1.0f), (-1.0f), 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, ",", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "210) test4879(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSummaryObjectEndText("]");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, ",", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "211) test4880(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "212) test4881(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "88) test4881(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray11 = new float[] { 100L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ">", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 100.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
// flaky "213) test4883(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "89) test4883(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray15 = new char[] { 'a', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.SimpleToStringStyle", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '#', '#' });
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getContentStart();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
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
        boolean boolean17 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "<", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("]");
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.String str15 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "214) test4887(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "90) test4887(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "]" + "'", str15, "]");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
// flaky "215) test4888(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.String str13 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
// flaky "216) test4890(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "91) test4890(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayStart("<size=");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "217) test4892(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setSizeEndText(">");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setNullText(",");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSizeEndText("");
        toStringStyle13.setContentEnd(">");
        java.lang.String str18 = toStringStyle13.getFieldSeparator();
        toStringStyle13.setSummaryObjectStartText(">");
        java.lang.String str21 = toStringStyle13.getContentEnd();
        toStringStyle13.setUseFieldNames(true);
        toStringStyle13.setContentStart("");
        toStringStyle13.setUseShortClassName(false);
        java.lang.String str28 = toStringStyle13.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle29.setSizeEndText("");
        toStringStyle29.setContentEnd("");
        java.lang.String str34 = toStringStyle29.getSizeEndText();
        toStringStyle29.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer37 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle38.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer41 = null;
        toStringStyle38.appendSuper(stringBuffer41, "hi!");
        boolean boolean44 = toStringStyle38.isArrayContentDetail();
        java.lang.String str45 = toStringStyle38.getArraySeparator();
        toStringStyle29.appendClassName(stringBuffer37, (java.lang.Object) str45);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle47.setFieldNameValueSeparator("hi!");
        boolean boolean51 = toStringStyle47.isFullDetail((java.lang.Boolean) true);
        toStringStyle47.setSummaryObjectStartText("<null>");
        java.lang.String str54 = toStringStyle47.getNullText();
        toStringStyle47.setFieldSeparatorAtEnd(false);
        toStringStyle47.setArraySeparator("<");
        boolean boolean59 = toStringStyle47.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle60 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle60.setFieldNameValueSeparator("hi!");
        java.lang.String str63 = toStringStyle60.getContentStart();
        java.lang.String str64 = toStringStyle60.getSizeEndText();
        java.lang.String str65 = toStringStyle60.getSizeStartText();
        toStringStyle60.setUseIdentityHashCode(false);
        toStringStyle60.setFieldSeparator("=");
        java.lang.Object[] objArray70 = new java.lang.Object[] { str28, toStringStyle29, toStringStyle47, toStringStyle60 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ">", objArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "]" + "'", str18, "]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ">" + "'", str21, ">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(toStringStyle38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<" + "'", str45, "<");
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "," + "'", str54, ",");
// flaky "218) test4893(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(toStringStyle60);
// flaky "92) test4893(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<null>" + "'", str63, "<null>");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str64, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "," + "'", str65, ",");
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeStartText("]");
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("]");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        java.lang.String str11 = toStringStyle8.getContentStart();
        java.lang.String str12 = toStringStyle8.getContentEnd();
        boolean boolean14 = toStringStyle8.isFullDetail((java.lang.Boolean) false);
        boolean boolean15 = toStringStyle8.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<null>", (java.lang.Object) toStringStyle8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "219) test4896(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.ShortPrefixToStringStyle", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "=");
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "220) test4898(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "93) test4898(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "32) test4898(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArraySeparator("ToStringStyle.DefaultToStringStyle");
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.String str13 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "221) test4900(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        java.lang.String str11 = toStringStyle0.getNullText();
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "]" + "'", str11, "]");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "222) test4902(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "223) test4903(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setUseIdentityHashCode(false);
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "224) test4904(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "94) test4904(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "33) test4904(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
// flaky "11) test4904(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", byteArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "225) test4906(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "95) test4906(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
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
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendSuper(stringBuffer14, "<null>");
        java.lang.String str17 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str22 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparator(",");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray17 = new double[] { 1.0d, 0, 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "{", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray19 = new boolean[] { true, true, true, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str2, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, false, true, true });
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
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
            toStringStyle0.appendSuper(stringBuffer9, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
// flaky "226) test4911(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "96) test4911(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldNameValueSeparator(",");
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer16 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "<null>", byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100 });
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("{");
        boolean boolean18 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle20.setSizeEndText("");
        toStringStyle20.setContentEnd("");
        toStringStyle20.setArrayContentDetail(false);
        java.lang.String str27 = toStringStyle20.getSummaryObjectStartText();
        java.lang.String str28 = toStringStyle20.getArrayStart();
        toStringStyle20.setFieldSeparator("hi!");
        java.lang.String str31 = toStringStyle20.getArrayEnd();
        java.lang.String str32 = toStringStyle20.getNullText();
        java.lang.String str33 = toStringStyle20.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer19, (java.lang.Object) toStringStyle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "227) test4913(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "97) test4913(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<" + "'", str28, "<");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<" + "'", str33, "<");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray10 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
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
            toStringStyle0.appendFieldEnd(stringBuffer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<" + "'", str8, "<");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendToString(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray10 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.DefaultToStringStyle", longArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str3, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("[");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "228) test4920(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("{");
        java.lang.String str13 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", byteArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str5 = toStringStyle0.getArrayStart();
        toStringStyle0.setSizeEndText(",");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        toStringStyle9.setUseFieldNames(true);
        java.lang.String str14 = toStringStyle9.getArraySeparator();
        java.lang.String str15 = toStringStyle9.getArrayStart();
// flaky "229) test4923(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) str15);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "]", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test4923(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<" + "'", str15, "<");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldNameValueSeparator("<");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray17 = new int[] { 100, (byte) 1, (short) 0, (short) -1, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 100, 1, 0, (-1), (-1), 10 });
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setContentEnd("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setFieldNameValueSeparator("hi!");
        toStringStyle11.setUseFieldNames(true);
        toStringStyle11.setArraySeparator("");
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        toStringStyle11.setUseShortClassName(false);
        boolean boolean21 = toStringStyle11.isFieldSeparatorAtStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ",", (java.lang.Object) boolean21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean13 = toStringStyle12.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        java.lang.String str15 = toStringStyle12.getSummaryObjectStartText();
        toStringStyle12.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean18 = toStringStyle12.isFieldSeparatorAtStart();
        toStringStyle12.setArrayStart("<size=");
        java.lang.String str21 = toStringStyle12.getSummaryObjectEndText();
        toStringStyle12.setContentStart("{");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle24.setSizeEndText("");
        toStringStyle24.setContentEnd(">");
        java.lang.String str29 = toStringStyle24.getFieldSeparator();
        toStringStyle24.setSummaryObjectStartText(">");
        java.lang.String str32 = toStringStyle24.getContentEnd();
        toStringStyle24.setUseFieldNames(true);
        toStringStyle24.setContentStart("");
        boolean boolean38 = toStringStyle24.isFullDetail((java.lang.Boolean) true);
        java.lang.Object[] objArray39 = new java.lang.Object[] { "{", true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<", objArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str21, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ">" + "'", str32, ">");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[{, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[{, true]");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray14 = new long[] { (byte) -1, (short) 100, 10L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { (-1L), 100L, 10L, 1L });
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        long[] longArray23 = new long[] { 100L, 0L, 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "]", longArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 100L, 0L, 97L, 35L, 32L });
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        boolean boolean14 = toStringStyle10.isFullDetail((java.lang.Boolean) true);
        toStringStyle10.setSummaryObjectStartText("<null>");
        boolean boolean17 = toStringStyle10.isDefaultFullDetail();
        toStringStyle10.setArrayStart("}");
        java.lang.String str20 = toStringStyle10.getContentStart();
        toStringStyle0.appendClassName(stringBuffer9, (java.lang.Object) str20);
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer22, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray12 = new long[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "<", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 97L });
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setContentStart("");
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray19 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        java.lang.String str4 = toStringStyle0.getNullText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArrayEnd("");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray6 = new short[] { (short) 0, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer1, "ToStringStyle.ShortPrefixToStringStyle", shortArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) -1, (short) 0 });
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setContentEnd("");
        toStringStyle11.setArrayContentDetail(false);
        java.lang.String str18 = toStringStyle11.getNullText();
        boolean boolean19 = toStringStyle11.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle11);
        toStringStyle11.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) "ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setContentEnd("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean12 = toStringStyle11.isFieldSeparatorAtEnd();
        boolean boolean13 = toStringStyle11.isUseFieldNames();
        toStringStyle11.setArrayContentDetail(true);
        toStringStyle11.setFieldSeparatorAtStart(false);
        toStringStyle11.setSizeEndText(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<", (java.lang.Object) toStringStyle11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray18 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.SimpleToStringStyle", booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { true, true });
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSizeStartText("hi!");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("]");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        boolean boolean12 = toStringStyle0.isArrayContentDetail();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText(",");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle17.setSizeEndText("");
        toStringStyle17.setContentEnd(">");
        java.lang.String str22 = toStringStyle17.getFieldSeparator();
        toStringStyle17.setSummaryObjectStartText(">");
        boolean boolean25 = toStringStyle17.isFieldSeparatorAtStart();
        java.lang.String str26 = toStringStyle17.getNullText();
        java.lang.String str27 = toStringStyle17.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer16, (java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "230) test4945(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<null>" + "'", str26, "<null>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ">" + "'", str27, ">");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<size=", objArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectEndText("{");
        toStringStyle0.setContentStart(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, ",", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        toStringStyle14.setUseFieldNames(true);
        toStringStyle14.setArraySeparator("");
        boolean boolean21 = toStringStyle14.isFieldSeparatorAtEnd();
        toStringStyle14.setArrayEnd("[");
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer26 = null;
        toStringStyle14.appendSuper(stringBuffer26, "]");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer12, ",", (java.lang.Object) "]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "231) test4949(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "99) test4949(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer9, "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray14 = new double[] { 100, 0.0d, (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 0.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer14, obj15);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str19 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "232) test4952(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getNullText();
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseClassName(false);
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "}", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "233) test4954(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentEnd("");
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSizeEndText("");
        toStringStyle15.setContentEnd("");
        toStringStyle15.setArrayContentDetail(false);
        java.lang.String str22 = toStringStyle15.getSummaryObjectStartText();
        java.lang.String str23 = toStringStyle15.getArrayStart();
        toStringStyle15.setFieldSeparator("hi!");
        java.lang.String str26 = toStringStyle15.getArrayEnd();
        java.lang.String str27 = toStringStyle15.getNullText();
        java.lang.String str28 = toStringStyle15.getArrayStart();
        java.lang.String str29 = toStringStyle15.getArraySeparator();
        toStringStyle15.setUseFieldNames(true);
        java.lang.Class<?> wildcardClass32 = toStringStyle15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "234) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "100) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "34) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky "12) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str23, "ToStringStyle.SimpleToStringStyle");
// flaky "6) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<null>" + "'", str27, "<null>");
// flaky "2) test4955(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str28, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "235) test4956(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<" + "'", str8, "<");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldNameValueSeparator("=");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "236) test4958(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "101) test4958(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldNameValueSeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "237) test4959(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "238) test4960(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
// flaky "102) test4960(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "35) test4960(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean22 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseClassName(false);
        java.lang.String str12 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "239) test4962(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "103) test4962(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        java.lang.String str17 = toStringStyle14.getContentStart();
        java.lang.String str18 = toStringStyle14.getSizeEndText();
        toStringStyle14.setFieldSeparatorAtStart(false);
        java.lang.String str21 = toStringStyle14.getSizeEndText();
        java.lang.String str22 = toStringStyle14.getContentStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, ">", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "240) test4963(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<null>" + "'", str17, "<null>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<size=" + "'", str18, "<size=");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<size=" + "'", str21, "<size=");
// flaky "104) test4963(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, ">", charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("<null>");
        toStringStyle0.setNullText("{");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str19 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart(",");
        toStringStyle0.setArrayEnd("]");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean4 = toStringStyle0.isUseClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeEndText("<");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        toStringStyle9.setContentEnd("");
        toStringStyle9.setNullText(">");
        toStringStyle9.setDefaultFullDetail(true);
        boolean boolean18 = toStringStyle9.isDefaultFullDetail();
        java.lang.String str19 = toStringStyle9.getArraySeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "241) test4967(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText("<size=");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray16 = new double[] { 0.0d, 1.0d, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 1.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean13 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray22 = new int[] { (short) 1, '#', (byte) 0, (byte) 100, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "[", intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 35, 0, 100, 1, 100 });
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str15 = toStringStyle14.getSizeEndText();
        java.lang.String str16 = toStringStyle14.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "242) test4970(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setArraySeparator("<");
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray17 = new double[] { 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.SimpleToStringStyle", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArraySeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray15 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false });
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle18.setSizeEndText("");
        toStringStyle18.setContentEnd("");
        toStringStyle18.setArrayContentDetail(false);
        java.lang.String str25 = toStringStyle18.getNullText();
        boolean boolean26 = toStringStyle18.isUseIdentityHashCode();
        toStringStyle18.setUseShortClassName(true);
        java.lang.String str29 = toStringStyle18.getFieldSeparator();
        boolean boolean30 = toStringStyle18.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass31 = toStringStyle18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer17, (java.lang.Object) wildcardClass31);
// flaky "243) test4975(org.apache.commons.lang3.builder.RegressionTest9)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
// flaky "105) test4975(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
// flaky "36) test4975(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparator("<null>");
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean13 = toStringStyle12.isUseShortClassName();
        java.lang.String str14 = toStringStyle12.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle12);
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle17.setSizeEndText("");
        toStringStyle12.appendClassName(stringBuffer16, (java.lang.Object) "");
        toStringStyle0.appendIdentityHashCode(stringBuffer11, (java.lang.Object) stringBuffer16);
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean25 = toStringStyle24.isUseShortClassName();
        toStringStyle24.setSizeEndText("");
        toStringStyle24.setContentEnd("{");
        toStringStyle24.setUseFieldNames(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer22, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "244) test4976(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "106) test4976(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentStart(">");
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "}", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "245) test4978(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.DefaultToStringStyle", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", longArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setArrayEnd("]");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setSummaryObjectStartText("hi!");
        toStringStyle11.setFieldSeparatorAtEnd(false);
        toStringStyle11.setUseIdentityHashCode(true);
        toStringStyle11.setSizeStartText(",");
        boolean boolean20 = toStringStyle11.isArrayContentDetail();
        boolean boolean21 = toStringStyle11.isUseIdentityHashCode();
        java.lang.String str22 = toStringStyle11.getSummaryObjectEndText();
        toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) str22);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "246) test4981(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "107) test4981(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str22, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        toStringStyle0.setUseShortClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ",", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str15 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle", booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "247) test4984(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "108) test4984(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("=");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray14 = new long[] { ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "248) test4985(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 32L, 0L });
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray18 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] {});
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
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
        toStringStyle0.setFieldSeparator("=");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "=", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "249) test4988(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setSummaryObjectEndText("{");
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.String str12 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("]");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "250) test4991(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "109) test4991(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSizeEndText("");
        toStringStyle8.setContentEnd("");
        java.lang.String str13 = toStringStyle8.getSizeEndText();
        toStringStyle8.setFieldSeparator("");
        toStringStyle8.setUseFieldNames(true);
        java.lang.String str18 = toStringStyle8.getArrayEnd();
        java.lang.String str19 = toStringStyle8.getFieldSeparator();
        java.lang.String str20 = toStringStyle8.getContentStart();
// flaky "251) test4992(org.apache.commons.lang3.builder.RegressionTest9)":         toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) str20);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "110) test4992(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "37) test4992(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky "13) test4992(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "=" + "'", str20, "=");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer14, obj15);
        boolean boolean17 = toStringStyle0.isArrayContentDetail();
        java.lang.String str18 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "252) test4993(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<" + "'", str18, "<");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray16 = new float[] { 0.0f, 100L, 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.DefaultToStringStyle", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "253) test4994(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 0.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparator("]");
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "254) test4995(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean11 = toStringStyle0.isUseFieldNames();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("{");
        boolean boolean15 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayEnd("<null>");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "255) test4996(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "111) test4996(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldNameValueSeparator(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "256) test4997(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSummaryObjectEndText("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray15 = new int[] { (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 1 });
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.String str11 = toStringStyle0.getContentEnd();
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "257) test4999(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setFieldNameValueSeparator("hi!");
        boolean boolean10 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        toStringStyle6.setSummaryObjectStartText("<null>");
        boolean boolean13 = toStringStyle6.isUseClassName();
        toStringStyle6.setDefaultFullDetail(true);
        java.lang.String str16 = toStringStyle6.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer5, (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "258) test5000(org.apache.commons.lang3.builder.RegressionTest9)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
    }
}
