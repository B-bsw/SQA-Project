package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test1502(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "2) test1502(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray19 = new float[] { (short) 1, 100.0f, 1.0f, 1.0f, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", floatArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 1.0f, 1.0f, 32.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        double[] doubleArray20 = new double[] { 1.0d, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "}", doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "3) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "1) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer5, "]", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test1505(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "4) test1505(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer6, "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "5) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "2) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "6) test1507(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test1507(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        double[] doubleArray22 = new double[] { (short) 10, 10.0d, 0L, '#', '4', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "=", doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test1508(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
// flaky "7) test1508(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "3) test1508(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 10.0d, 0.0d, 35.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<null>", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "8) test1509(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "9) test1510(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "8) test1510(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        boolean boolean13 = toStringStyle10.isArrayContentDetail();
        toStringStyle10.setDefaultFullDetail(false);
        toStringStyle10.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "10) test1511(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "9) test1511(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "4) test1511(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        toStringStyle0.setArrayEnd("<");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("hi!");
        java.lang.String str20 = toStringStyle17.getContentStart();
        java.lang.String str21 = toStringStyle17.getSizeEndText();
        toStringStyle17.setFieldSeparatorAtStart(false);
        java.lang.String str24 = toStringStyle17.getContentEnd();
        toStringStyle17.setUseShortClassName(false);
        java.lang.String str27 = toStringStyle17.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "11) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle17);
// flaky "10) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
// flaky "5) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str21, "ToStringStyle.SimpleToStringStyle");
// flaky "1) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str24, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "1) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str27, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray13 = new char[] { 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", charArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "12) test1513(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', 'a', '#' });
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle6.setFieldNameValueSeparator("hi!");
        java.lang.String str9 = toStringStyle6.getContentStart();
        java.lang.String str10 = toStringStyle6.getSizeEndText();
        java.lang.String str11 = toStringStyle6.getArraySeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) str11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(toStringStyle6);
// flaky "13) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
// flaky "11) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
// flaky "6) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSizeEndText("");
        toStringStyle14.setContentEnd(">");
        boolean boolean20 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        boolean boolean21 = toStringStyle14.isFieldSeparatorAtStart();
        toStringStyle14.setFieldNameValueSeparator("]");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray13 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", longArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "14) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "12) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "7) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "2) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray15 = new int[] { (short) 0, 1, (byte) 0, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<null>", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "15) test1517(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
// flaky "13) test1517(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 1, 0, 35, 100 });
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer3, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "16) test1519(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
// flaky "14) test1519(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "]" + "'", str8, "]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSizeEndText("");
        toStringStyle6.setContentEnd("");
        toStringStyle6.setArrayContentDetail(false);
        java.lang.String str13 = toStringStyle6.getNullText();
        boolean boolean14 = toStringStyle6.isUseIdentityHashCode();
        boolean boolean16 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        toStringStyle6.setNullText("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle19.setFieldNameValueSeparator("hi!");
        java.lang.String str22 = toStringStyle19.getContentStart();
        java.lang.String str23 = toStringStyle19.getContentEnd();
        java.lang.Object[] objArray24 = new java.lang.Object[] { toStringStyle6, str23 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", objArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(toStringStyle6);
// flaky "17) test1520(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(toStringStyle19);
// flaky "15) test1520(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{" + "'", str22, "{");
// flaky "8) test1520(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str23, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { 'a', 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "[", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', 'a', 'a', '#' });
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "[", byteArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setSizeEndText("");
        toStringStyle12.setContentEnd("");
        toStringStyle12.setArrayContentDetail(false);
        java.lang.String str19 = toStringStyle12.getSummaryObjectStartText();
        java.lang.String str20 = toStringStyle12.getArrayStart();
        toStringStyle12.setFieldSeparator("hi!");
        java.lang.String str23 = toStringStyle12.getArrayEnd();
        java.lang.String str24 = toStringStyle12.getNullText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer11, (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<null>" + "'", str19, "<null>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<" + "'", str23, "<");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<", obj9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "18) test1524(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "16) test1524(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", doubleArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "19) test1525(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, ">", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean13 = toStringStyle12.isFieldSeparatorAtEnd();
        toStringStyle12.setContentStart(">");
        toStringStyle12.setContentEnd("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer10, ",", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "20) test1527(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "17) test1527(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "9) test1527(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray14 = new int[] { (short) 1, ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "]", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 32, 97 });
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray10 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "hi!", booleanArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test1529(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] { false, false });
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseShortClassName(false);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean9);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
            toStringStyle0.append(stringBuffer10, ",", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "22) test1531(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "18) test1531(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "10) test1531(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "=", (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test1532(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "]" + "'", str5, "]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray19 = new double[] { (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "}", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
// flaky "24) test1533(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
            toStringStyle0.appendDetail(stringBuffer14, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "25) test1534(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
// flaky "19) test1534(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "]" + "'", str10, "]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "26) test1535(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "hi!", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "27) test1536(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test1537(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "20) test1537(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
// flaky "11) test1537(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray19 = new char[] { '4', '#', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "29) test1538(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '4', ' ', '4' });
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
            toStringStyle0.removeLastFieldSeparator(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "30) test1539(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "21) test1539(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(",");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray13 = new long[] { (short) 100, '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", longArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "31) test1540(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 100L, 35L, 97L });
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "32) test1541(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray13 = new boolean[] { true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true, false, false });
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<null>", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "33) test1543(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
// flaky "22) test1543(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle16.setFieldNameValueSeparator("hi!");
        java.lang.String str19 = toStringStyle16.getContentStart();
        java.lang.String str20 = toStringStyle16.getSizeEndText();
        toStringStyle16.setFieldSeparatorAtStart(false);
        java.lang.String str23 = toStringStyle16.getSizeEndText();
        java.lang.String str24 = toStringStyle16.getContentStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "34) test1544(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str19, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str20, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str23, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str24, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<null>", byteArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test1545(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray17 = new float[] { 0L, (short) 1, (byte) 10, 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 0.0f, 1.0f, 10.0f, 100.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<null>", byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "36) test1547(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "37) test1548(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
// flaky "23) test1548(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "}", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("{");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle9.appendSuper(stringBuffer12, "hi!");
        boolean boolean15 = toStringStyle9.isArrayContentDetail();
        boolean boolean16 = toStringStyle9.isFieldSeparatorAtStart();
        boolean boolean17 = toStringStyle9.isDefaultFullDetail();
        toStringStyle9.setSummaryObjectStartText("ToStringStyle.ShortPrefixToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle20.setSizeEndText("");
        toStringStyle20.setContentEnd(">");
        java.lang.String str25 = toStringStyle20.getContentStart();
        java.lang.String str26 = toStringStyle20.getFieldSeparator();
        toStringStyle20.setFieldNameValueSeparator("<null>");
        java.lang.Object[] objArray29 = new java.lang.Object[] { toStringStyle9, toStringStyle20 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<", objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "38) test1550(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray18 = new double[] { (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<null>", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "39) test1551(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        java.lang.String str12 = toStringStyle9.getContentStart();
        java.lang.String str13 = toStringStyle9.getContentStart();
        toStringStyle9.setFieldSeparator("=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (java.lang.Object) toStringStyle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "40) test1552(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer18 = null;
        short[] shortArray25 = new short[] { (short) -1, (byte) 100, (byte) 1, (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "{", shortArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "41) test1553(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
// flaky "24) test1553(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) -1, (short) 100, (short) 1, (short) 100, (short) 0 });
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ">", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "42) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
// flaky "25) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle6.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle6.appendSuper(stringBuffer9, "hi!");
        boolean boolean12 = toStringStyle6.isArrayContentDetail();
        boolean boolean13 = toStringStyle6.isFieldSeparatorAtStart();
        boolean boolean14 = toStringStyle6.isDefaultFullDetail();
        boolean boolean15 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle6);
        toStringStyle6.setUseShortClassName(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer5, (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
// flaky "43) test1556(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "26) test1556(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setContentStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseClassName(false);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str11);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        long[] longArray19 = new long[] { 10L, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "[", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "44) test1558(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "27) test1558(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 10L, (-1L), (-1L) });
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str14 = toStringStyle13.getArraySeparator();
        java.lang.String str15 = toStringStyle13.getFieldSeparator();
        java.lang.String str16 = toStringStyle13.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) toStringStyle13);
// flaky "45) test1559(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "12) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "3) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
// flaky "2) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray22 = new boolean[] { true, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", booleanArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "46) test1560(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "29) test1560(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { true, true, true, true, false });
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setUseClassName(false);
        toStringStyle10.setNullText("");
        toStringStyle10.setArrayContentDetail(true);
        toStringStyle10.setArraySeparator("");
        java.lang.String str19 = toStringStyle10.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean21 = toStringStyle20.isFieldSeparatorAtEnd();
        toStringStyle20.setNullText(",");
        java.lang.String str24 = toStringStyle20.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle25.setFieldNameValueSeparator("hi!");
        java.lang.String str28 = toStringStyle25.getContentStart();
        toStringStyle25.setSummaryObjectStartText("");
        toStringStyle25.setUseClassName(true);
        toStringStyle25.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle25.setFieldSeparatorAtStart(true);
        boolean boolean37 = toStringStyle25.isUseClassName();
        java.lang.Object[] objArray38 = new java.lang.Object[] { str19, str24, boolean37 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", objArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "47) test1561(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "30) test1561(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str28, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, , true]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test1563(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "31) test1563(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "49) test1564(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setFieldNameValueSeparator("hi!");
        toStringStyle11.setUseFieldNames(true);
        toStringStyle11.setArraySeparator("");
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        toStringStyle11.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle11.setSizeEndText("");
        toStringStyle11.setFieldSeparator("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle25.setSummaryObjectStartText("hi!");
        java.lang.String str28 = toStringStyle25.getArraySeparator();
        java.lang.String str29 = toStringStyle25.getContentEnd();
        boolean boolean30 = toStringStyle25.isDefaultFullDetail();
        boolean boolean31 = toStringStyle25.isDefaultFullDetail();
        boolean boolean32 = toStringStyle25.isDefaultFullDetail();
        java.lang.String str33 = toStringStyle25.getSummaryObjectStartText();
        toStringStyle25.setFieldSeparator("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str37 = toStringStyle36.getSummaryObjectStartText();
        toStringStyle36.setArrayStart("ToStringStyle.SimpleToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle40.setFieldNameValueSeparator("hi!");
        toStringStyle40.setUseFieldNames(true);
        toStringStyle40.setArraySeparator("");
        boolean boolean47 = toStringStyle40.isFieldSeparatorAtEnd();
        toStringStyle40.setArrayEnd("[");
        java.lang.Object[] objArray50 = new java.lang.Object[] { toStringStyle11, toStringStyle25, toStringStyle36, "[" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "hi!", objArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "50) test1565(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "32) test1565(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "13) test1565(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky "4) test1565(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + ">" + "'", str29, ">");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L });
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "]", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSummaryObjectStartText("hi!");
        toStringStyle14.setFieldSeparatorAtEnd(false);
        toStringStyle14.setUseIdentityHashCode(true);
        toStringStyle14.setSizeStartText(",");
        java.lang.String str23 = toStringStyle14.getSummaryObjectEndText();
        java.lang.String str24 = toStringStyle14.getNullText();
        toStringStyle14.setContentEnd(",");
        toStringStyle14.setDefaultFullDetail(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "51) test1568(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str23, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "]", charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<size=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseShortClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray12 = new int[] { (short) 10, '4', 10, '#', (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "<", intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "52) test1571(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 52, 10, 35, (-1), 0 });
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray7 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "}", floatArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "53) test1572(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        java.lang.String str17 = toStringStyle14.getContentStart();
        toStringStyle14.setSummaryObjectStartText("");
        toStringStyle14.setUseClassName(true);
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle14.appendToString(stringBuffer22, "");
        toStringStyle14.setArrayContentDetail(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (java.lang.Object) true, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str17, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky "54) test1574(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray18 = new long[] { ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", longArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 32L, 0L });
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        toStringStyle0.setSummaryObjectEndText("<size=");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer17, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "55) test1576(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setContentStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.SimpleToStringStyle", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("{");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("hi!");
        toStringStyle8.setArrayEnd(">");
        toStringStyle8.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle8.setFieldSeparatorAtStart(true);
        boolean boolean17 = toStringStyle8.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer6, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray13 = new float[] { 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "hi!", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 0.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparator("<null>");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentEnd("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<null>", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        boolean boolean13 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray16 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "56) test1581(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray16 = new boolean[] { true, true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "57) test1582(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, true, true, true, true });
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "58) test1583(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "33) test1583(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer7, "[", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "59) test1584(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "34) test1584(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray7 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "", floatArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "60) test1585(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldNameValueSeparator("]");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray15 = new int[] { (short) 10, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "}", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 1, 10 });
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<size=", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { false, false });
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray14 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ",", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "61) test1589(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52 });
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ",", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "62) test1590(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "35) test1590(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, ">", byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer8, ">", obj10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        java.lang.String str16 = toStringStyle13.getArraySeparator();
        java.lang.String str17 = toStringStyle13.getContentEnd();
        boolean boolean18 = toStringStyle13.isDefaultFullDetail();
        toStringStyle13.setArraySeparator("");
        toStringStyle13.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "63) test1593(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "36) test1593(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
            toStringStyle0.appendDetail(stringBuffer11, "=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "64) test1595(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray10 = new boolean[] { true, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", booleanArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] { true, false, true, true });
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray8 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, ">", charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a' });
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer4, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray14 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.SimpleToStringStyle", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayStart("]");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.ShortPrefixToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "}", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "]", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "65) test1603(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, ">", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setNullText("<null>");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        boolean boolean14 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle18.setSummaryObjectStartText("hi!");
        java.lang.String str21 = toStringStyle18.getArraySeparator();
        java.lang.String str22 = toStringStyle18.getContentEnd();
        boolean boolean23 = toStringStyle18.isDefaultFullDetail();
        toStringStyle18.setArraySeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer16, "]", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "66) test1605(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle18);
// flaky "37) test1605(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getContentEnd();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "67) test1607(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<size=", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, true, true });
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray7 = new float[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.SimpleToStringStyle", floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "68) test1609(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArraySeparator(">");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean15 = toStringStyle14.isUseShortClassName();
        boolean boolean16 = toStringStyle14.isUseIdentityHashCode();
        boolean boolean18 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        boolean boolean20 = toStringStyle14.isFullDetail((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "{", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test1610(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ",", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "70) test1611(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "38) test1611(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<null>", (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "hi!", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test1613(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "39) test1613(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "72) test1614(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.StringBuffer stringBuffer17 = null;
        char[] charArray25 = new char[] { '4', ' ', ' ', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "ToStringStyle.SimpleToStringStyle", charArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', ' ', '#', '#', ' ' });
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray14 = new short[] { (byte) 1, (short) -1, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 1, (short) -1, (short) 100, (short) 0 });
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean9 = toStringStyle8.isFieldSeparatorAtEnd();
        java.lang.String str10 = toStringStyle8.getSummaryObjectEndText();
        boolean boolean11 = toStringStyle8.isArrayContentDetail();
        toStringStyle8.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle8.setArrayEnd("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "73) test1618(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "40) test1618(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray10 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, "]", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray10 = new int[] { (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "ToStringStyle.SimpleToStringStyle", intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10 });
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "<", (java.lang.Object) boolean16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer3 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "=", byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "74) test1623(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "75) test1624(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "41) test1624(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "14) test1624(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.SimpleToStringStyle", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "76) test1625(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray16 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false, true });
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray15 = new long[] { 0L, 10L, (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", longArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "77) test1627(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "42) test1627(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 0L, 10L, 10L, 100L });
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray8 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "]", booleanArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] {});
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "=", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "78) test1630(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparatorAtEnd(true);
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSizeEndText("");
        toStringStyle13.setContentEnd("");
        toStringStyle13.setArrayContentDetail(false);
        java.lang.String str20 = toStringStyle13.getNullText();
        boolean boolean21 = toStringStyle13.isUseIdentityHashCode();
        toStringStyle13.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean24 = toStringStyle13.isUseFieldNames();
        java.lang.String str25 = toStringStyle13.getSizeEndText();
        toStringStyle13.setNullText("{");
        java.lang.StringBuffer stringBuffer28 = null;
        toStringStyle13.appendToString(stringBuffer28, "]");
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.Object obj32 = null;
        toStringStyle13.appendClassName(stringBuffer31, obj32);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "<null>", obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "79) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "43) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
// flaky "15) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "5) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
            toStringStyle0.append(stringBuffer10, "<null>", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<", booleanArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, false, true, true, true });
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object[] objArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", objArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "80) test1635(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "44) test1635(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSizeEndText("");
        toStringStyle15.setContentEnd("");
        toStringStyle15.setArrayContentDetail(false);
        java.lang.String str22 = toStringStyle15.getSummaryObjectStartText();
        java.lang.String str23 = toStringStyle15.getArrayStart();
        toStringStyle15.setFieldSeparator("hi!");
        java.lang.String str26 = toStringStyle15.getArrayEnd();
        java.lang.String str27 = toStringStyle15.getNullText();
        toStringStyle15.setUseFieldNames(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer13, "", (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "81) test1636(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "45) test1636(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky "16) test1636(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "}" + "'", str23, "}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "," + "'", str26, ",");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{" + "'", str27, "{");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "=", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray12 = new double[] { (short) 0, (-1), 100L, (-1.0d), (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, ",", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "82) test1639(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "46) test1639(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray14 = new boolean[] { true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, true, true, true });
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray11 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "}", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "83) test1641(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 10 });
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "=" + "'", str2, "=");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "]");
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.Object obj19 = null;
        toStringStyle0.appendClassName(stringBuffer18, obj19);
        java.lang.String str21 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "84) test1643(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "47) test1643(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + ">" + "'", str21, ">");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray13 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "<", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray18 = new double[] { 10, '4', (short) 10, (-1.0d), 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "85) test1647(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "48) test1647(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 52.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer8 = null;
// flaky "86) test1648(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer8, "");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setFieldNameValueSeparator("hi!");
        boolean boolean17 = toStringStyle13.isFullDetail((java.lang.Boolean) true);
        toStringStyle13.setSummaryObjectStartText("<null>");
        toStringStyle13.setFieldNameValueSeparator("hi!");
        toStringStyle13.setSizeStartText("");
        toStringStyle13.setFieldSeparator("<null>");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "<null>", (java.lang.Object) "<null>", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test1649(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray15 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<null>", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 52 });
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "88) test1651(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSummaryObjectStartText("hi!");
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        toStringStyle5.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str12 = toStringStyle5.getSummaryObjectEndText();
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) toStringStyle5);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray16 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", booleanArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "89) test1652(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
// flaky "90) test1653(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "91) test1654(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
// flaky "92) test1655(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "93) test1656(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setArraySeparator(">");
        java.lang.Class<?> wildcardClass12 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(false);
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray16 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "94) test1658(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', '4' });
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        java.lang.StringBuffer stringBuffer22 = null;
        short[] shortArray30 = new short[] { (short) 100, (byte) 10, (byte) 1, (short) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle11.appendSummary(stringBuffer22, "", shortArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "95) test1659(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "49) test1659(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100, (short) 10, (short) 1, (short) -1, (short) 1, (short) 10 });
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setFieldNameValueSeparator("hi!");
        boolean boolean10 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        java.lang.String str11 = toStringStyle6.getNullText();
        toStringStyle6.setFieldSeparatorAtStart(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, ",", (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "96) test1660(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "50) test1660(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayEnd("<null>");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "97) test1661(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "51) test1661(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle2.setSummaryObjectStartText("hi!");
        boolean boolean6 = toStringStyle2.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle2.isUseFieldNames();
        toStringStyle0.appendClassName(stringBuffer1, (java.lang.Object) boolean7);
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray15 = new int[] { '4', ' ', 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "98) test1662(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 52, 32, 100, 1 });
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray21 = new boolean[] { true, true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "}", booleanArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, true, false, true, true, true });
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer2, "<null>", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray12 = new float[] { 0, (-1L), (short) 1, (short) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.SimpleToStringStyle", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, (-1.0f), 1.0f, 1.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart(",");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "[", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "99) test1667(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSummaryObjectStartText("hi!");
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        toStringStyle5.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str12 = toStringStyle5.getSummaryObjectEndText();
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) toStringStyle5);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray21 = new float[] { (byte) 100, 1L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, ">", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "100) test1668(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 100.0f, 1.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", (double) (short) 0);
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray19 = new char[] { 'a', 'a', 'a', 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "]", charArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', 'a', 'a', 'a', '#', '4' });
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "hi!", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
// flaky "101) test1673(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "102) test1674(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray12 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", byteArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "}", booleanArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false, true, false });
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle13.setSummaryObjectStartText("hi!");
        toStringStyle13.setFieldSeparatorAtEnd(false);
        toStringStyle13.setUseIdentityHashCode(true);
        toStringStyle13.setSizeStartText(",");
        java.lang.String str22 = toStringStyle13.getSummaryObjectEndText();
        java.lang.String str23 = toStringStyle13.getNullText();
        boolean boolean24 = toStringStyle13.isUseIdentityHashCode();
        java.lang.String str25 = toStringStyle13.getNullText();
        toStringStyle13.setSizeStartText("]");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer11, ">", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "103) test1677(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "52) test1677(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
// flaky "17) test1677(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + ">" + "'", str23, ">");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "6) test1677(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.String str6 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str13 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer14, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "104) test1681(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean13 = toStringStyle12.isFieldSeparatorAtEnd();
        java.lang.String str14 = toStringStyle12.getNullText();
        boolean boolean15 = toStringStyle12.isFieldSeparatorAtEnd();
        toStringStyle12.setFieldNameValueSeparator("");
        toStringStyle12.setDefaultFullDetail(false);
        toStringStyle12.setArrayContentDetail(true);
        toStringStyle12.setUseIdentityHashCode(true);
        java.lang.String str24 = toStringStyle12.getSummaryObjectStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "=", (java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "{", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "105) test1684(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray8 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.ShortPrefixToStringStyle", booleanArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] {});
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setArraySeparator("");
        java.lang.String str15 = toStringStyle12.getContentStart();
        boolean boolean16 = toStringStyle12.isDefaultFullDetail();
        java.lang.String str17 = toStringStyle12.getArrayEnd();
        toStringStyle12.setDefaultFullDetail(true);
        toStringStyle12.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setUseClassName(false);
        toStringStyle12.setNullText("");
        toStringStyle12.setArrayContentDetail(true);
        toStringStyle12.setArraySeparator("");
        java.lang.String str21 = toStringStyle12.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", (java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "106) test1687(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{" + "'", str21, "{");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ">", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "107) test1688(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getArrayStart();
        java.lang.Class<?> wildcardClass8 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "108) test1690(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray11 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "hi!", charArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray14 = new double[] { (short) -1, (short) 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean11 = toStringStyle10.isFieldSeparatorAtEnd();
        java.lang.String str12 = toStringStyle10.getNullText();
        boolean boolean13 = toStringStyle10.isFieldSeparatorAtEnd();
        toStringStyle10.setFieldNameValueSeparator("");
        toStringStyle10.setDefaultFullDetail(false);
        toStringStyle10.setArrayContentDetail(true);
        boolean boolean20 = toStringStyle10.isUseFieldNames();
        toStringStyle10.setContentStart(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer8, "]", (java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray15 = new float[] { 10.0f, '#', 10L, 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "=", floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "109) test1694(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 10.0f, 35.0f, 10.0f, 97.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str13 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "110) test1696(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<", charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str10 = toStringStyle0.getContentEnd();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray15 = new float[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<size=", floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, "=", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "111) test1699(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray12 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "112) test1700(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "53) test1700(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "18) test1700(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayStart("[");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray15 = new long[] { 'a', (byte) 10, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "113) test1701(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 97L, 10L, 100L, 1L });
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "{", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray8 = new short[] { (short) 1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, "<", shortArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "114) test1703(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 1, (short) 10, (short) 1 });
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "115) test1704(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.SimpleToStringStyle", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "54) test1704(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str6 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setUseClassName(false);
        toStringStyle10.setNullText("");
        toStringStyle10.setArrayContentDetail(true);
        toStringStyle10.setArraySeparator("");
        boolean boolean19 = toStringStyle10.isUseShortClassName();
        toStringStyle10.setArraySeparator("");
        toStringStyle10.setSizeEndText("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "116) test1705(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
// flaky "55) test1705(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "=", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "117) test1706(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray13 = new long[] { 10, (byte) 100, (byte) 0, ' ', 100L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ">", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 10L, 100L, 0L, 32L, 100L, 10L });
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        long[] longArray22 = new long[] { 0L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "hi!", longArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "118) test1708(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "56) test1708(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 0L, 0L });
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray12 = new short[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", shortArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "119) test1709(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1 });
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, ",", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "120) test1710(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("hi!");
        java.lang.String str15 = toStringStyle12.getContentStart();
        toStringStyle12.setArrayContentDetail(false);
        boolean boolean19 = toStringStyle12.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.appendClassName(stringBuffer11, (java.lang.Object) toStringStyle12);
        java.lang.String str21 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "121) test1711(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer8, ">", obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "122) test1712(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "123) test1713(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray15 = new double[] { ' ', 1.0d, 'a', (-1.0d), 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 32.0d, 1.0d, 97.0d, (-1.0d), 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { (short) 100, (byte) 1, '4', (short) 100, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "{", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 1.0d, 52.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
            toStringStyle0.appendContentStart(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "124) test1716(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle16.setUseClassName(false);
        toStringStyle16.setNullText("");
        toStringStyle16.setArrayContentDetail(true);
        toStringStyle16.setArraySeparator("");
        java.lang.String str25 = toStringStyle16.getFieldSeparator();
        java.lang.StringBuffer stringBuffer26 = null;
        toStringStyle16.appendSuper(stringBuffer26, "");
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle16.appendToString(stringBuffer29, ",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "125) test1717(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(toStringStyle16);
// flaky "57) test1717(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{" + "'", str25, "{");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, ">", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray9 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "{", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setSizeEndText("");
        toStringStyle9.setContentEnd("");
        toStringStyle9.setArrayContentDetail(false);
        java.lang.String str16 = toStringStyle9.getNullText();
        boolean boolean17 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setSizeStartText("[");
        boolean boolean20 = toStringStyle9.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "126) test1720(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
// flaky "58) test1720(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "19) test1720(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "7) test1720(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "3) test1720(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
// flaky "127) test1721(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        toStringStyle9.setSummaryObjectStartText("=");
        java.lang.StringBuffer stringBuffer24 = null;
        long[] longArray31 = new long[] { (byte) 1, 100L, (byte) 1, '#', 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendDetail(stringBuffer24, "<null>", longArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
// flaky "59) test1721(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 1L, 100L, 1L, 35L, 0L });
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "128) test1722(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "[", (float) (-1));
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "{", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getArrayStart();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        java.lang.String str13 = toStringStyle10.getContentStart();
        toStringStyle10.setSummaryObjectStartText("");
        toStringStyle10.setUseClassName(true);
        toStringStyle10.setDefaultFullDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle21.setSizeEndText("");
        toStringStyle21.setContentEnd(">");
        java.lang.String str26 = toStringStyle21.getFieldSeparator();
        boolean boolean27 = toStringStyle21.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle28.setSizeEndText("");
        toStringStyle28.setContentEnd("");
        toStringStyle28.setArrayContentDetail(false);
        java.lang.String str35 = toStringStyle28.getNullText();
        boolean boolean36 = toStringStyle28.isUseIdentityHashCode();
        toStringStyle28.setUseShortClassName(true);
        java.lang.String str39 = toStringStyle28.getFieldSeparator();
        boolean boolean40 = toStringStyle28.isFieldSeparatorAtEnd();
        boolean boolean41 = toStringStyle28.isDefaultFullDetail();
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, "<", boolean27, boolean41 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", objArray42, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertNotNull(toStringStyle21);
// flaky "129) test1726(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "," + "'", str26, ",");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str35, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky "60) test1726(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, <, true, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, <, true, false]");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "{", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSizeEndText("");
        toStringStyle14.setContentEnd("");
        java.lang.String str19 = toStringStyle14.getSizeEndText();
        toStringStyle14.setFieldSeparator("");
        toStringStyle14.setUseFieldNames(true);
        java.lang.String str24 = toStringStyle14.getSizeStartText();
        toStringStyle14.setSizeStartText("hi!");
        toStringStyle14.setSizeEndText("=");
        java.lang.String str29 = toStringStyle14.getArrayEnd();
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.String str32 = toStringStyle14.getArrayEnd();
        java.lang.Object[] objArray33 = new java.lang.Object[] { toStringStyle14 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "]", objArray33, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
// flaky "130) test1728(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str24, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray15 = new char[] { '#', '#', '#', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "131) test1729(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', '#', ' ', '#', ' ' });
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray12 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<size=", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayEnd("");
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray13 = new double[] { (short) 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", doubleArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "132) test1731(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray14 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<null>", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray15 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "133) test1733(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSizeEndText("");
        toStringStyle7.setContentEnd(">");
        java.lang.String str12 = toStringStyle7.getContentStart();
        boolean boolean13 = toStringStyle7.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle16.setFieldNameValueSeparator("hi!");
        java.lang.String str19 = toStringStyle16.getContentStart();
        toStringStyle16.setSummaryObjectStartText("");
        toStringStyle16.setUseClassName(true);
        toStringStyle16.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle16.setFieldSeparatorAtStart(true);
        toStringStyle14.appendIdentityHashCode(stringBuffer15, (java.lang.Object) true);
        java.lang.StringBuffer stringBuffer29 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean31 = toStringStyle30.isUseShortClassName();
        toStringStyle30.setUseFieldNames(true);
        boolean boolean34 = toStringStyle30.isArrayContentDetail();
        java.lang.String str35 = toStringStyle30.getSizeStartText();
        java.lang.String str36 = toStringStyle30.getContentStart();
        toStringStyle14.appendIdentityHashCode(stringBuffer29, (java.lang.Object) str36);
        java.lang.Object[] objArray38 = new java.lang.Object[] { boolean13, toStringStyle14 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", objArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "134) test1734(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(toStringStyle7);
// flaky "61) test1734(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
        org.junit.Assert.assertNotNull(toStringStyle30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "," + "'", str35, ",");
// flaky "20) test1734(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray8 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "]", intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "135) test1735(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray10 = new long[] { (short) 10, '#', (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "ToStringStyle.SimpleToStringStyle", longArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "136) test1736(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "62) test1736(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 10L, 35L, 100L, (-1L) });
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
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
// flaky "137) test1737(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray16 = new int[] { '4', (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 52, 1, 0 });
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle4.setSummaryObjectStartText("hi!");
        toStringStyle4.setFieldSeparatorAtEnd(false);
        toStringStyle4.setUseIdentityHashCode(true);
        toStringStyle4.setSizeStartText(",");
        java.lang.String str13 = toStringStyle4.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle4.getNullText();
        boolean boolean15 = toStringStyle4.isUseIdentityHashCode();
        java.lang.String str16 = toStringStyle4.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer3, (java.lang.Object) toStringStyle4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "138) test1739(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle4);
// flaky "63) test1739(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str17 = toStringStyle16.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer14, ",", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "139) test1740(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "64) test1740(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toStringStyle16);
// flaky "21) test1740(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "140) test1741(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray14 = new char[] { '#', ' ', '4', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.SimpleToStringStyle", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', '#', ' ', 'a' });
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "=", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "141) test1744(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSummaryObjectStartText("hi!");
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        boolean boolean10 = toStringStyle5.isUseFieldNames();
        toStringStyle3.appendClassName(stringBuffer4, (java.lang.Object) boolean10);
        toStringStyle3.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle3.appendSuper(stringBuffer14, "<null>");
// flaky "142) test1745(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) "<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer6, ",");
// flaky "143) test1746(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "65) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<size=", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "144) test1747(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.lang.StringBuffer stringBuffer15 = null;
        int[] intArray21 = new int[] { 100, (short) 0, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "]", intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "145) test1748(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "66) test1748(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
// flaky "22) test1748(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 0, 32, 0 });
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        long[] longArray19 = new long[] { 100L, 100L, ' ', (byte) 100, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "146) test1749(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 100L, 100L, 32L, 100L, (-1L), 32L });
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "147) test1750(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<null>", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str13 = toStringStyle12.getArraySeparator();
        java.lang.String str14 = toStringStyle12.getFieldSeparator();
        java.lang.String str15 = toStringStyle12.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ">", (java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
// flaky "148) test1752(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "67) test1752(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
// flaky "149) test1753(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) toStringStyle9);
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean25 = toStringStyle24.isUseShortClassName();
        boolean boolean26 = toStringStyle24.isUseIdentityHashCode();
        boolean boolean28 = toStringStyle24.isFullDetail((java.lang.Boolean) false);
        java.lang.String str29 = toStringStyle24.getArraySeparator();
        toStringStyle24.setSizeEndText(">");
        java.lang.String str32 = toStringStyle24.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle9.appendSummary(stringBuffer22, "}", (java.lang.Object) toStringStyle24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
// flaky "68) test1753(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky "23) test1753(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[" + "'", str32, "[");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray13 = new long[] { (byte) 100, '#', (short) -1, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 100L, 35L, (-1L), 32L, 10L });
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayStart("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer7, "{");
// flaky "150) test1755(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "69) test1755(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) boolean13);
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, ",", objArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "151) test1756(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray11 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "[", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", objArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        java.lang.String str17 = toStringStyle14.getContentStart();
        toStringStyle14.setSummaryObjectStartText("");
        toStringStyle14.setUseClassName(true);
        toStringStyle14.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle14.setFieldSeparatorAtStart(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer12, ">", (java.lang.Object) toStringStyle14);
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
// flaky "152) test1759(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{" + "'", str17, "{");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray16 = new boolean[] { true, false, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, false, false, true, true });
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtEnd();
        java.lang.String str15 = toStringStyle13.getSummaryObjectEndText();
        boolean boolean16 = toStringStyle13.isArrayContentDetail();
        toStringStyle13.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean19 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setUseShortClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "<", (java.lang.Object) toStringStyle13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<null>" + "'", str15, "<null>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray5 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "=", shortArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", 'a');
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "{", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
            toStringStyle0.appendContentEnd(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "153) test1765(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str2 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSummaryObjectStartText("hi!");
        toStringStyle5.setFieldSeparatorAtEnd(false);
        toStringStyle5.setUseIdentityHashCode(true);
        toStringStyle5.setSizeStartText(",");
        java.lang.String str14 = toStringStyle5.getSummaryObjectEndText();
        java.lang.String str15 = toStringStyle5.getNullText();
        boolean boolean16 = toStringStyle5.isUseIdentityHashCode();
        toStringStyle5.setSummaryObjectEndText("");
        java.lang.Class<?> wildcardClass19 = toStringStyle5.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle20.setSizeEndText("");
        toStringStyle20.setContentEnd(">");
        java.lang.String str25 = toStringStyle20.getFieldSeparator();
        toStringStyle20.setSummaryObjectStartText(">");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean29 = toStringStyle28.isUseShortClassName();
        boolean boolean30 = toStringStyle28.isUseIdentityHashCode();
        boolean boolean32 = toStringStyle28.isFullDetail((java.lang.Boolean) false);
        java.lang.String str33 = toStringStyle28.getArraySeparator();
        toStringStyle28.setSizeEndText(">");
        boolean boolean36 = toStringStyle28.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle37.setArrayEnd(",");
        toStringStyle37.setSummaryObjectStartText("");
        java.lang.String str42 = toStringStyle37.getContentEnd();
        java.lang.Class<?> wildcardClass43 = toStringStyle37.getClass();
        java.lang.Object[] objArray44 = new java.lang.Object[] { wildcardClass19, toStringStyle20, boolean36, wildcardClass43 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "ToStringStyle.ShortPrefixToStringStyle", objArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "154) test1766(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "70) test1766(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(toStringStyle20);
// flaky "24) test1766(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<null>" + "'", str25, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ">" + "'", str42, ">");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setSummaryObjectEndText("{");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "155) test1767(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.SimpleToStringStyle", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setArraySeparator("");
        java.lang.String str9 = toStringStyle6.getContentStart();
        boolean boolean10 = toStringStyle6.isDefaultFullDetail();
        java.lang.String str11 = toStringStyle6.getArrayEnd();
        boolean boolean12 = toStringStyle6.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "", (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
// flaky "156) test1769(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "157) test1770(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
// flaky "158) test1771(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer11, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test1771(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "25) test1771(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "8) test1771(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle3.setFieldNameValueSeparator("hi!");
        boolean boolean7 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle3.setSummaryObjectStartText("<null>");
        java.lang.String str10 = toStringStyle3.getNullText();
        toStringStyle3.setFieldSeparatorAtEnd(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer1, "<size=", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer9, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "159) test1773(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean10 = toStringStyle9.isFieldSeparatorAtEnd();
        toStringStyle9.setContentStart(">");
        toStringStyle9.setContentEnd("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer7, "=", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "160) test1774(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "72) test1774(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "26) test1774(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText("[");
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setArraySeparator("");
        java.lang.String str17 = toStringStyle14.getSummaryObjectEndText();
        toStringStyle14.setUseShortClassName(false);
        boolean boolean20 = toStringStyle14.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer12, "]", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "161) test1776(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
// flaky "162) test1777(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer16, "ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        double[] doubleArray22 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, "hi!", doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle6.setSummaryObjectStartText("hi!");
        boolean boolean10 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        toStringStyle6.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str13 = toStringStyle6.getSummaryObjectEndText();
        toStringStyle6.setContentEnd(">");
        boolean boolean17 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "[", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "163) test1779(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<null>", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer2 = null;
        char[] charArray10 = new char[] { '#', ' ', '4', 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "hi!", charArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', 'a', '#', '4' });
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray17 = new char[] { 'a', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "164) test1782(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', '4', 'a', '4' });
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray17 = new char[] { 'a', '4', '4', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", charArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "165) test1783(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', '4', '4', '4', '4', '4' });
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "]");
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.Object obj19 = null;
        toStringStyle0.appendClassName(stringBuffer18, obj19);
        java.lang.StringBuffer stringBuffer21 = null;
        float[] floatArray29 = new float[] { (short) 100, 10, ' ', 'a', (short) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer21, ",", floatArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "166) test1784(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "73) test1784(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 100.0f, 10.0f, 32.0f, 97.0f, 100.0f, 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray12 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "167) test1785(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', 'a' });
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "]", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
// flaky "168) test1786(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        short[] shortArray22 = new short[] { (short) 0, (short) 0, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "]", shortArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "169) test1788(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 0, (short) 0, (short) 1, (short) -1 });
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("]");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray13 = new short[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<", shortArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 1 });
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setSummaryObjectStartText("hi!");
        java.lang.String str10 = toStringStyle7.getArraySeparator();
        java.lang.String str11 = toStringStyle7.getContentEnd();
        boolean boolean12 = toStringStyle7.isDefaultFullDetail();
        boolean boolean13 = toStringStyle7.isDefaultFullDetail();
        java.lang.String str14 = toStringStyle7.getContentEnd();
        java.lang.String str15 = toStringStyle7.getSummaryObjectStartText();
        toStringStyle7.setUseFieldNames(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer6, (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "170) test1790(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle7);
// flaky "74) test1790(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "27) test1790(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "9) test1790(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str14, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer6 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ">", objMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setArraySeparator("");
        java.lang.String str17 = toStringStyle14.getContentStart();
        boolean boolean18 = toStringStyle14.isDefaultFullDetail();
        toStringStyle14.setFieldSeparatorAtEnd(false);
        java.lang.Object[] objArray21 = new java.lang.Object[] { toStringStyle14 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", objArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]" + "'", str2, "]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "171) test1793(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "{", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "]" + "'", str7, "]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "172) test1795(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "]" + "'", str4, "]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray16 = new boolean[] { false, true, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false, true, true, true, true, false });
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        float[] floatArray19 = new float[] { 10.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "=", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "173) test1797(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "75) test1797(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 10.0f, 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "174) test1798(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "76) test1798(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "175) test1799(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "]" + "'", str3, "]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isUseClassName();
        toStringStyle0.setSizeEndText("hi!");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "176) test1802(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "]", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "177) test1803(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { 10.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "178) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "77) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle7.setFieldNameValueSeparator("hi!");
        boolean boolean10 = toStringStyle7.isArrayContentDetail();
        toStringStyle7.setDefaultFullDetail(false);
        toStringStyle7.setArrayContentDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle15.setSizeEndText("");
        toStringStyle15.setContentEnd("");
        toStringStyle15.setArrayContentDetail(false);
        java.lang.String str22 = toStringStyle15.getNullText();
        boolean boolean23 = toStringStyle15.isUseIdentityHashCode();
        toStringStyle15.setArrayContentDetail(false);
        java.lang.String str26 = toStringStyle15.getSizeEndText();
        boolean boolean27 = toStringStyle15.isUseClassName();
        toStringStyle15.setUseShortClassName(true);
        java.lang.Object[] objArray30 = new java.lang.Object[] { false, toStringStyle15 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.ShortPrefixToStringStyle", objArray30, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "179) test1805(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertNotNull(toStringStyle7);
// flaky "78) test1805(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "28) test1805(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray15 = new char[] { ' ', ' ', '#', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "180) test1806(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ', '#', '#', '#' });
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.Class<?> wildcardClass5 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<" + "'", str2, "<");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray13 = new int[] { (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, ",", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 32 });
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray16 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<null>", intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray18 = new char[] { '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "181) test1810(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '4' });
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSummaryObjectStartText("hi!");
        java.lang.String str13 = toStringStyle10.getArraySeparator();
        java.lang.String str14 = toStringStyle10.getContentEnd();
        toStringStyle10.setSizeStartText("hi!");
        java.lang.String str17 = toStringStyle10.getFieldNameValueSeparator();
        java.lang.String str18 = toStringStyle10.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray21 = new long[] { (short) 1, (short) 100, ' ', 1L, ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ",", longArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "182) test1813(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L, 100L, 32L, 1L, 32L, 1L });
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray9 = new short[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "<", shortArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) -1 });
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "[", byteArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "183) test1815(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean21 = toStringStyle20.isFieldSeparatorAtEnd();
        boolean boolean22 = toStringStyle20.isUseFieldNames();
        java.lang.String str23 = toStringStyle20.getSummaryObjectEndText();
        boolean boolean24 = toStringStyle20.isUseShortClassName();
        toStringStyle20.setArraySeparator("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean27 = toStringStyle20.isUseFieldNames();
        java.lang.String str28 = toStringStyle20.getNullText();
        toStringStyle20.setArrayEnd(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) ",", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "184) test1816(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<null>" + "'", str23, "<null>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<" + "'", str28, "<");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
            toStringStyle0.append(stringBuffer13, "}", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "{", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "185) test1818(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray13 = new long[] { (byte) 10, (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ",", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 10L, (-1L), 52L });
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.Class<?> wildcardClass4 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray15 = new long[] { (short) -1, (byte) 100, (byte) 0, 1L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<size=", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 100L, 0L, 1L, 0L });
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray11 = new double[] { (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "]", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "186) test1823(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<null>", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray13 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true });
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "]", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "187) test1826(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean6 = toStringStyle5.isUseShortClassName();
        toStringStyle5.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setSummaryObjectStartText("hi!");
        boolean boolean14 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        toStringStyle10.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str17 = toStringStyle10.getSummaryObjectEndText();
        toStringStyle5.appendClassName(stringBuffer9, (java.lang.Object) toStringStyle10);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer4, (java.lang.Object) toStringStyle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle14.setSummaryObjectStartText("hi!");
        boolean boolean18 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle14.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<size=", (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "188) test1828(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "=", charArray5, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str8 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray15 = new short[] { (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "189) test1830(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "79) test1830(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "29) test1830(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) -1, (short) 10 });
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
// flaky "190) test1831(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer5, "}");
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "80) test1831(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray14 = new short[] { (byte) -1, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "=", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "191) test1832(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "81) test1832(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) -1, (short) 0 });
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "]", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray18 = new float[] { (-1L), (byte) -1, (short) -1, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "}", floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "192) test1834(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { (-1.0f), (-1.0f), (-1.0f), 52.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("[");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.Class<?> wildcardClass5 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "193) test1835(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray12 = new int[] { 'a', 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 0 });
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "{", objMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "194) test1837(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objMap17);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "]", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "195) test1838(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "]" + "'", str9, "]");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test1839(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "197) test1840(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "{", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeEndText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray12 = new char[] { 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "]", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText("]");
        toStringStyle0.setArraySeparator(",");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean14 = toStringStyle13.isFieldSeparatorAtStart();
        toStringStyle13.setDefaultFullDetail(true);
        boolean boolean17 = toStringStyle13.isArrayContentDetail();
        java.lang.String str18 = toStringStyle13.getSummaryObjectEndText();
        toStringStyle13.setFieldSeparatorAtEnd(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean22 = toStringStyle21.isFieldSeparatorAtEnd();
        toStringStyle21.setFieldSeparatorAtEnd(false);
        toStringStyle21.setSummaryObjectEndText(">");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle27.setSizeEndText("");
        toStringStyle27.setContentEnd("");
        java.lang.String str32 = toStringStyle27.getSizeEndText();
        toStringStyle27.setFieldSeparator("");
        toStringStyle27.setUseFieldNames(true);
        java.lang.String str37 = toStringStyle27.getSizeStartText();
        toStringStyle27.setSizeStartText("hi!");
        toStringStyle27.setSizeEndText("=");
        java.lang.String str42 = toStringStyle27.getFieldNameValueSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle43.setSummaryObjectStartText("hi!");
        boolean boolean47 = toStringStyle43.isFullDetail((java.lang.Boolean) false);
        boolean boolean48 = toStringStyle43.isUseFieldNames();
        boolean boolean49 = toStringStyle43.isFieldSeparatorAtEnd();
        boolean boolean50 = toStringStyle43.isDefaultFullDetail();
        java.lang.String str51 = toStringStyle43.getContentStart();
        java.lang.Class<?> wildcardClass52 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle53 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle53.setArraySeparator("");
        java.lang.String str56 = toStringStyle53.getContentStart();
        java.lang.String str57 = toStringStyle53.getSummaryObjectEndText();
        java.lang.Object[] objArray58 = new java.lang.Object[] { true, toStringStyle21, toStringStyle27, toStringStyle43, str57 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", objArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "198) test1843(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[" + "'", str37, "[");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
// flaky "82) test1843(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(toStringStyle53);
// flaky "30) test1843(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ">" + "'", str57, ">");
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean5 = toStringStyle4.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle4.isUseFieldNames();
        java.lang.String str7 = toStringStyle4.getSummaryObjectStartText();
        toStringStyle4.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        boolean boolean10 = toStringStyle4.isFieldSeparatorAtStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer3, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "=" + "'", str2, "=");
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer3 = null;
        int[] intArray7 = new int[] { 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "<size=", intArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 100, 0 });
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object[] objArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "199) test1847(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "83) test1847(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "200) test1848(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.String str1 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky "201) test1849(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
// flaky "84) test1849(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getArraySeparator();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray12 = new double[] { '#', '4', (-1.0d), (-1), 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "{", doubleArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "202) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
// flaky "85) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 52.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
            toStringStyle0.appendDetail(stringBuffer8, "<null>", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "203) test1851(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getContentStart();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer6, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "}", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setNullText("<");
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.ShortPrefixToStringStyle", objArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "]", charArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '#' });
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer5, "{", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
// flaky "204) test1857(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.String str1 = toStringStyle0.getFieldSeparator();
        java.lang.String str2 = toStringStyle0.getSizeEndText();
        toStringStyle0.setContentEnd("=");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray13 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "]", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "205) test1858(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] {});
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle.SimpleToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray13 = new double[] { 1, (byte) -1, (short) -1, (short) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "=", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "206) test1860(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str4, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, (-1.0d), (-1.0d), 10.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ">");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean12 = toStringStyle11.isFieldSeparatorAtStart();
        toStringStyle11.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle11.isArrayContentDetail();
        toStringStyle11.setFieldNameValueSeparator("[");
        boolean boolean18 = toStringStyle11.isUseFieldNames();
        java.lang.String str19 = toStringStyle11.getNullText();
        boolean boolean20 = toStringStyle11.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle21.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle21.appendSuper(stringBuffer24, "hi!");
        boolean boolean27 = toStringStyle21.isArrayContentDetail();
        boolean boolean28 = toStringStyle21.isFieldSeparatorAtStart();
        boolean boolean29 = toStringStyle21.isDefaultFullDetail();
        toStringStyle21.setSummaryObjectStartText("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle32.setSummaryObjectStartText("hi!");
        java.lang.String str35 = toStringStyle32.getArraySeparator();
        java.lang.String str36 = toStringStyle32.getContentEnd();
        boolean boolean37 = toStringStyle32.isDefaultFullDetail();
        toStringStyle32.setArraySeparator("");
        java.lang.String str40 = toStringStyle32.getFieldSeparator();
        java.lang.String str41 = toStringStyle32.getContentEnd();
        java.lang.String str42 = toStringStyle32.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle43.setUseShortClassName(false);
        boolean boolean46 = toStringStyle43.isUseFieldNames();
        java.lang.Object[] objArray47 = new java.lang.Object[] { toStringStyle11, "", toStringStyle32, boolean46 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", objArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "207) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "86) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
// flaky "31) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "10) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<null>" + "'", str19, "<null>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ">" + "'", str36, ">");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ">" + "'", str41, ">");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray15 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "208) test1863(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, false, true });
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray12 = new double[] { 10.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<size=", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray12 = new int[] { 10, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 0, 0 });
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray19 = new char[] { '4', '#', ' ', ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', ' ', ' ', 'a', ' ' });
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "209) test1867(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", byteArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "210) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "211) test1869(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        java.lang.StringBuffer stringBuffer14 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap16 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "=", objMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "212) test1870(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objMap16);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator("<null>");
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
// flaky "213) test1871(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.SimpleToStringStyle", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "214) test1873(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "87) test1873(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setFieldSeparator("{");
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
// flaky "215) test1874(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
// flaky "88) test1874(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray11 = new long[] { (short) -1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "216) test1875(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "89) test1875(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
// flaky "32) test1875(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L), 100L, 52L });
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.ShortPrefixToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "217) test1876(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
            toStringStyle0.appendDetail(stringBuffer15, "<", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "218) test1878(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = toStringStyle0.getNullText();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str6, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.SimpleToStringStyle", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "219) test1880(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "90) test1880(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray13 = new boolean[] { false, false, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "}", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, false, false, true, true, true });
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle5.setSummaryObjectStartText("hi!");
        boolean boolean9 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        toStringStyle5.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str12 = toStringStyle5.getSummaryObjectEndText();
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) toStringStyle5);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle18.setSizeEndText("");
        toStringStyle18.setContentEnd("");
        java.lang.String str23 = toStringStyle18.getSizeEndText();
        toStringStyle18.setUseIdentityHashCode(true);
        boolean boolean26 = toStringStyle18.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean28 = toStringStyle27.isUseShortClassName();
        boolean boolean29 = toStringStyle27.isUseIdentityHashCode();
        boolean boolean31 = toStringStyle27.isFullDetail((java.lang.Boolean) false);
        java.lang.String str32 = toStringStyle27.getArraySeparator();
        toStringStyle27.setSizeEndText(">");
        java.lang.String str35 = toStringStyle27.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean37 = toStringStyle36.isUseShortClassName();
        java.lang.String str38 = toStringStyle36.getNullText();
        boolean boolean39 = toStringStyle36.isArrayContentDetail();
        java.lang.Object[] objArray40 = new java.lang.Object[] { boolean26, str35, toStringStyle36 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "}", objArray40, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "220) test1882(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(toStringStyle27);
// flaky "91) test1882(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str38, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setArraySeparator(",");
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", doubleArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "221) test1883(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray12 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<size=", charArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "222) test1884(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle14.appendSuper(stringBuffer17, "hi!");
        boolean boolean20 = toStringStyle14.isArrayContentDetail();
        java.lang.String str21 = toStringStyle14.getArraySeparator();
        java.lang.String str22 = toStringStyle14.getSummaryObjectEndText();
        boolean boolean23 = toStringStyle14.isUseIdentityHashCode();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle24.setSummaryObjectStartText("hi!");
        toStringStyle24.setFieldSeparatorAtEnd(false);
        toStringStyle24.setUseIdentityHashCode(true);
        toStringStyle24.setSizeStartText(",");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle33.setFieldNameValueSeparator("hi!");
        boolean boolean37 = toStringStyle33.isFullDetail((java.lang.Boolean) true);
        toStringStyle33.setSummaryObjectStartText("<null>");
        java.lang.String str40 = toStringStyle33.getNullText();
        boolean boolean41 = toStringStyle33.isUseShortClassName();
        java.lang.String str42 = toStringStyle33.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle43.setDefaultFullDetail(true);
        toStringStyle43.setArrayContentDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle48.setUseClassName(false);
        toStringStyle48.setNullText("");
        toStringStyle48.setArrayContentDetail(true);
        toStringStyle48.setArraySeparator("");
        java.lang.String str57 = toStringStyle48.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle58 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle58.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer61 = null;
        toStringStyle58.appendSuper(stringBuffer61, "hi!");
        boolean boolean64 = toStringStyle58.isArrayContentDetail();
        java.lang.Object[] objArray65 = new java.lang.Object[] { toStringStyle14, ",", str42, false, str57, boolean64 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", objArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "223) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "92) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky "33) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "]" + "'", str22, "]");
// flaky "11) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str42, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(toStringStyle58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setContentStart("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle11.setArraySeparator("");
        java.lang.String str14 = toStringStyle11.getContentStart();
        boolean boolean15 = toStringStyle11.isDefaultFullDetail();
        java.lang.String str16 = toStringStyle11.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, ">", (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setArrayStart("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray17 = new boolean[] { false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false, true, false, false, true });
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray12 = new char[] { 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '4' });
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("]");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "224) test1890(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer6, "[");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "93) test1890(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        int[] intArray8 = new int[] { (short) 0, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "hi!", intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, (-1), 10 });
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "225) test1892(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayEnd("}");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        toStringStyle0.setSummaryObjectEndText("<size=");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer17, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "226) test1894(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean8 = toStringStyle7.isUseShortClassName();
        boolean boolean9 = toStringStyle7.isUseIdentityHashCode();
        toStringStyle7.setNullText(">");
        toStringStyle7.setSummaryObjectStartText("<null>");
        java.lang.String str14 = toStringStyle7.getFieldNameValueSeparator();
        java.lang.String str15 = toStringStyle7.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setArraySeparator("");
        java.lang.String str19 = toStringStyle16.getContentStart();
        java.lang.String str20 = toStringStyle16.getNullText();
        boolean boolean21 = toStringStyle16.isArrayContentDetail();
        toStringStyle16.setFieldNameValueSeparator("");
        java.lang.Object[] objArray24 = new java.lang.Object[] { toStringStyle7, toStringStyle16 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "=", objArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "227) test1895(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str19, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle8.setSummaryObjectStartText("hi!");
        toStringStyle8.setSizeEndText(">");
        java.lang.Class<?> wildcardClass13 = toStringStyle8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "", (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "228) test1896(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        java.lang.String str14 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray23 = new short[] { (byte) 0, (short) 1, (short) 10, (short) 0, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.ShortPrefixToStringStyle", shortArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "229) test1897(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "94) test1897(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "34) test1897(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 0, (short) 1, (short) 10, (short) 0, (short) 1, (short) 1 });
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
            toStringStyle0.appendContentEnd(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "230) test1898(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray14 = new int[] { '4', 1, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "231) test1899(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "95) test1899(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52, 1, 1, 100 });
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer17, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str8, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "232) test1900(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str11, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "]" + "'", str12, "]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str13, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setNullText(",");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray13 = new long[] { (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "=", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "233) test1901(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "96) test1901(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L, 0L });
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray15 = new boolean[] { true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "=", booleanArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, true, false });
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray3 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer1, ">", charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object[] objArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray11 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true });
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "=", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "234) test1906(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray24 = new boolean[] { true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "}", booleanArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "235) test1907(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "97) test1907(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str15, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { true, false, false, true });
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray8 = new char[] { ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "<", charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a' });
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.Class<?> wildcardClass13 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "236) test1909(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArraySeparator("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "237) test1911(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "]", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "]", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str2 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        long[] longArray9 = new long[] { (short) 100, (short) 100, ' ', 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "ToStringStyle.ShortPrefixToStringStyle", longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 100L, 100L, 32L, 0L });
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArraySeparator("<size=");
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray13 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", byteArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray18 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "[", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "238) test1916(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1 });
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.String str6 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray13 = new short[] { (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "}", shortArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
// flaky "239) test1917(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100, (short) -1 });
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "");
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray18 = new double[] { 'a', 1.0f, (byte) 100, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "240) test1918(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 97.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "241) test1919(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<null>", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "242) test1920(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayStart("ToStringStyle.SimpleToStringStyle");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<size=" + "'", str2, "<size=");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "243) test1921(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str9, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer11, "<");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "244) test1923(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str2, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "245) test1924(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArraySeparator("");
        java.lang.String str3 = toStringStyle0.getContentStart();
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str8 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray14 = new int[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "246) test1925(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "98) test1925(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "35) test1925(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100 });
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setArrayEnd("]");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "]", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        float[] floatArray10 = new float[] { 1, 10L, (short) 10, 1.0f, (-1), 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer2, "ToStringStyle.SimpleToStringStyle", floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, 10.0f, 10.0f, 1.0f, (-1.0f), 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
            toStringStyle0.append(stringBuffer14, "[", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "247) test1928(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<" + "'", str9, "<");
// flaky "99) test1928(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "248) test1929(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "100) test1929(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "ToStringStyle.SimpleToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "249) test1930(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ">", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        byte[] byteArray16 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "250) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "101) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100 });
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "251) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str3, "ToStringStyle.ShortPrefixToStringStyle");
// flaky "102) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<" + "'", str6, "<");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "[", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.Class<?> wildcardClass13 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("]");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer14, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "252) test1938(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setArraySeparator("<");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle16.setSizeEndText("");
        toStringStyle16.setContentEnd("");
        toStringStyle16.setArrayContentDetail(false);
        java.lang.String str23 = toStringStyle16.getNullText();
        boolean boolean24 = toStringStyle16.isUseIdentityHashCode();
        toStringStyle16.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        boolean boolean27 = toStringStyle16.isDefaultFullDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle28.setFieldNameValueSeparator("hi!");
        java.lang.String str31 = toStringStyle28.getContentStart();
        toStringStyle28.setSummaryObjectStartText("");
        toStringStyle28.setUseClassName(true);
        java.lang.String str36 = toStringStyle28.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle37.setFieldNameValueSeparator("hi!");
        toStringStyle37.setUseFieldNames(true);
        toStringStyle37.setArraySeparator("");
        java.lang.String str44 = toStringStyle37.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle45.setFieldNameValueSeparator("hi!");
        boolean boolean49 = toStringStyle45.isFullDetail((java.lang.Boolean) true);
        toStringStyle45.setSummaryObjectStartText("<null>");
        java.lang.String str52 = toStringStyle45.getNullText();
        toStringStyle45.setFieldSeparatorAtEnd(false);
        toStringStyle45.setArraySeparator("<");
        boolean boolean57 = toStringStyle45.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle58 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle58.setSizeEndText("");
        toStringStyle58.setContentEnd("");
        java.lang.String str63 = toStringStyle58.getSizeEndText();
        toStringStyle58.setUseFieldNames(true);
        java.lang.Object[] objArray66 = new java.lang.Object[] { boolean27, toStringStyle28, toStringStyle37, toStringStyle45, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", objArray66, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "253) test1939(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle16);
// flaky "103) test1939(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + ">" + "'", str23, ">");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(toStringStyle28);
// flaky "36) test1939(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<null>" + "'", str31, "<null>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<" + "'", str36, "<");
        org.junit.Assert.assertNotNull(toStringStyle37);
// flaky "12) test1939(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "," + "'", str44, ",");
        org.junit.Assert.assertNotNull(toStringStyle45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky "4) test1939(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + ">" + "'", str52, ">");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(toStringStyle58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<null>", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "254) test1940(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "104) test1940(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle4.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle4.appendSuper(stringBuffer7, "hi!");
        boolean boolean10 = toStringStyle4.isArrayContentDetail();
        boolean boolean11 = toStringStyle4.isFieldSeparatorAtStart();
        boolean boolean12 = toStringStyle4.isDefaultFullDetail();
        toStringStyle4.setSummaryObjectStartText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer2, ",", (java.lang.Object) toStringStyle4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setArrayEnd(">");
        toStringStyle0.setNullText("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.SimpleToStringStyle", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSizeStartText("");
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeStartText(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "255) test1943(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "<", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "256) test1945(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + ">" + "'", str2, ">");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setUseFieldNames(false);
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray15 = new short[] { (byte) -1, (short) 0, (short) -1, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) -1, (short) 0, (short) -1, (short) 10, (short) 10 });
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "257) test1947(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean8 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray19 = new char[] { ' ', 'a', 'a', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "{", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', 'a', 'a', '4', '#', ' ' });
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "258) test1949(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray13 = new boolean[] { true, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.SimpleToStringStyle", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "259) test1950(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "105) test1950(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<" + "'", str4, "<");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true, true, true, true, false });
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setNullText(",");
        java.lang.String str4 = toStringStyle0.getSizeEndText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", objMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(objMap9);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.String str3 = toStringStyle0.getContentEnd();
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray14 = new float[] { (byte) 1, 0L, '#', 100.0f, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, ",", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 0.0f, 35.0f, 100.0f, 100.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setSummaryObjectStartText("]");
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setFieldNameValueSeparator("hi!");
        boolean boolean16 = toStringStyle12.isFullDetail((java.lang.Boolean) true);
        toStringStyle12.setSummaryObjectStartText("<null>");
        boolean boolean19 = toStringStyle12.isDefaultFullDetail();
        java.lang.String str20 = toStringStyle12.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "260) test1954(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
// flaky "261) test1955(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer9, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setContentEnd("ToStringStyle.ShortPrefixToStringStyle");
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "262) test1956(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd("[");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str6 = toStringStyle0.getContentEnd();
        toStringStyle0.setArrayStart("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "}", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "263) test1960(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer6, "");
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "106) test1960(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str5, "ToStringStyle.ShortPrefixToStringStyle");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer14, "=", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str12, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getNullText();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray14 = new int[] { (short) 10, 100, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10, 100, 1, 0 });
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "264) test1963(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "107) test1963(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
// flaky "37) test1963(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        toStringStyle0.setSizeEndText("[");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "265) test1964(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectStartText("<null>");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { 10, 1, 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "{", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "266) test1965(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "108) test1965(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 10L, 1L, 10L, (-1L) });
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setNullText(">");
        boolean boolean7 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseFieldNames(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "267) test1966(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        double[] doubleArray17 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray16 = new double[] { (byte) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", doubleArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky "268) test1969(org.apache.commons.lang3.builder.RegressionTest3)":             toStringStyle0.appendSuper(stringBuffer18, "hi!");
// flaky "109) test1969(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str4 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray11 = new long[] { (byte) 10, (-1L), ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "]", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "269) test1970(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 10L, (-1L), 32L, 35L });
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.String str9 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { 100, '4', (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "270) test1971(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "110) test1971(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "38) test1971(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 100L, 52L, (-1L), 1L });
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str2 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { 10L, 100, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "271) test1972(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str7, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 10L, 100L, 10L, 52L });
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer10 = null;
// flaky "272) test1974(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray15 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.SimpleToStringStyle", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        double[] doubleArray4 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "]", doubleArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "273) test1975(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle9.setFieldNameValueSeparator("hi!");
        boolean boolean13 = toStringStyle9.isFullDetail((java.lang.Boolean) true);
        toStringStyle9.setSummaryObjectStartText("<null>");
        java.lang.String str16 = toStringStyle9.getNullText();
        toStringStyle9.setFieldSeparatorAtEnd(false);
        toStringStyle9.setArraySeparator("<");
        boolean boolean21 = toStringStyle9.isFieldSeparatorAtStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer7, "<size=", (java.lang.Object) toStringStyle9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayEnd("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setContentStart(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<" + "'", str3, "<");
// flaky "274) test1977(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "111) test1977(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "{", objArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
// flaky "275) test1978(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean3 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray9 = new double[] { 1L, 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "", doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "276) test1979(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ">");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseClassName(false);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { 100, 'a', 'a', 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<null>", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str2, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 97.0d, 97.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
            toStringStyle0.appendDetail(stringBuffer10, "<null>", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "}", byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky "277) test1983(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray15 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10 });
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<size=", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "278) test1985(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "279) test1986(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "112) test1986(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        java.lang.String str3 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "=", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str5 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setSizeEndText("=");
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle18.setFieldNameValueSeparator("hi!");
        toStringStyle18.setArrayEnd(">");
        boolean boolean23 = toStringStyle18.isFieldSeparatorAtEnd();
        boolean boolean24 = toStringStyle18.isArrayContentDetail();
        toStringStyle18.setDefaultFullDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer16, "]", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "280) test1988(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.ShortPrefixToStringStyle" + "'", str10, "ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle10.setFieldNameValueSeparator("hi!");
        toStringStyle10.setUseFieldNames(true);
        toStringStyle10.setArraySeparator("");
        toStringStyle10.setSizeEndText("hi!");
        toStringStyle10.setArrayStart(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", (java.lang.Object) ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "281) test1989(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "282) test1990(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "113) test1990(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "283) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setFieldNameValueSeparator("<");
        java.lang.Class<?> wildcardClass8 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer5, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "284) test1993(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "114) test1993(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSummaryObjectStartText("hi!");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText(",");
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer11, "[", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "285) test1994(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setNullText(">");
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer6, "]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "286) test1995(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray12 = new float[] { 'a', 10, 0.0f, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "}", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 97.0f, 10.0f, 0.0f, 52.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator("");
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("");
        toStringStyle0.setSizeEndText("{");
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { (byte) 1, (byte) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 10.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str7 = toStringStyle0.getNullText();
        boolean boolean8 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText("[");
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "287) test1998(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "115) test1998(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
            toStringStyle0.appendToString(stringBuffer15, ",");
// flaky "288) test1999(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "116) test1999(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
// flaky "39) test1999(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "13) test1999(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setFieldNameValueSeparator("hi!");
        boolean boolean4 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str5 = toStringStyle0.getNullText();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "289) test2000(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 100.0f }, (float) 1.0E-15);
    }
}
