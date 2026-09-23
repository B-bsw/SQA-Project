package com.fasterxml.jackson.core.filter;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue(base64Variant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate13._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate13._itemFilter;
        boolean boolean16 = filteringParserDelegate13.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(base64Variant7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            short short5 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        int int7 = filteringParserDelegate4.getFormatFeatures();
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._allowMultipleMatches = false;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4.rootFilter = tokenFilter7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4.rootFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.readBinaryValue(base64Variant9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = filteringParserDelegate4._itemFilter;
        org.junit.Assert.assertNull(tokenFilter5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        filteringParserDelegate4._includePath = false;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4.rootFilter;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        boolean boolean7 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        org.junit.Assert.assertNull(jsonToken5);
    }
}

