package org.apache.commons.cli;

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
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        java.lang.String str20 = defaultParser0.currentToken;
        java.util.List list21 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options22, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(list21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options15, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "hi!", "", "" });
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options20, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "";
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "", "" });
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.String str11 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.skipParsing;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.String str5 = defaultParser0.currentToken;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        boolean boolean12 = defaultParser0.skipParsing;
        boolean boolean13 = defaultParser0.skipParsing;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options16, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.skipParsing;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        java.lang.String str20 = defaultParser0.currentToken;
        boolean boolean21 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list17 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options8, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        defaultParser0.currentToken = "";
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        java.lang.Class<?> wildcardClass20 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options17, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.skipParsing;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options5, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options5, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options8, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        boolean boolean18 = defaultParser0.skipParsing;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.cmd;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options21, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNull(commandLine20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.skipParsing;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        java.util.List list15 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass6 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        java.lang.String str17 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine19 = null;
        defaultParser0.cmd = commandLine19;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options18);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options20, strArray24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options12, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str17 = defaultParser0.currentToken;
        boolean boolean18 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options18);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        defaultParser0.skipParsing = false;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(commandLine4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options8, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = null;
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options19, strArray20, properties21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options8, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options7, strArray8, properties9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.skipParsing;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        defaultParser0.stopAtNonOption = false;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray7, properties8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options20, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options16, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(option5);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray16, properties17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.lang.String str16 = defaultParser0.currentToken;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass20 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(list19);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = defaultParser0.expectedOpts;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = options14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list16 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass17 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        java.lang.String str10 = defaultParser0.currentToken;
        java.lang.String str11 = defaultParser0.currentToken;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.lang.String str16 = defaultParser0.currentToken;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options19, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options10, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine22 = null;
        defaultParser0.cmd = commandLine22;
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine32 = defaultParser0.parse(options24, strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options16, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        java.util.List list17 = defaultParser0.expectedOpts;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        org.apache.commons.cli.Option option22 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine30 = defaultParser0.parse(options23, strArray28, properties29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options12, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options8, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options20, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = option15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options17, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options12, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        boolean boolean9 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "";
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.util.List list3 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        java.util.List list16 = defaultParser0.expectedOpts;
        java.lang.String str17 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "", "" });
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list6 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = defaultParser0.expectedOpts;
        java.lang.String str14 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.skipParsing;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        boolean boolean15 = defaultParser0.skipParsing;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.stopAtNonOption = false;
        java.util.List list20 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.cmd;
        java.util.List list22 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNull(list22);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.stopAtNonOption = true;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        java.util.List list17 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.stopAtNonOption = false;
        java.util.List list20 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options21, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = options11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass19 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options7, strArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean10 = defaultParser0.stopAtNonOption;
        java.lang.String str11 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.currentToken = "hi!";
        java.util.List list20 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine21 = null;
        defaultParser0.cmd = commandLine21;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options23, strArray24, properties25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.lang.Class<?> wildcardClass5 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.util.List list13 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = list13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = false;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.skipParsing;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray10, properties11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options7, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options12, strArray13, properties14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        boolean boolean6 = defaultParser0.skipParsing;
        java.lang.String str7 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        defaultParser0.skipParsing = true;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = option10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        boolean boolean11 = defaultParser0.skipParsing;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options6, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.junit.Assert.assertNull(list1);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.skipParsing;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options8, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        boolean boolean18 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(commandLine19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options12, strArray13, properties14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        boolean boolean20 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options19, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.stopAtNonOption = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options16, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = null;
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray16, properties17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options16, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list11 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        java.lang.Class<?> wildcardClass20 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "", "", "" });
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.String str11 = defaultParser0.currentToken;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option21 = null;
        defaultParser0.currentOption = option21;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = defaultParser0.expectedOpts;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options9, strArray16, properties17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options4, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options14, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine19 = null;
        defaultParser0.cmd = commandLine19;
        java.lang.String str21 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = defaultParser0.expectedOpts;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.lang.String str11 = defaultParser0.currentToken;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.stopAtNonOption = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options6, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.currentToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options15, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        java.util.List list19 = defaultParser0.expectedOpts;
        java.lang.String str20 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options21 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(options21);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.util.Properties properties28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options20, strArray27, properties28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "", "hi!" });
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.util.List list13 = defaultParser0.expectedOpts;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "";
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        boolean boolean16 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        java.lang.String str17 = defaultParser0.currentToken;
        boolean boolean18 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options7, strArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options11, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        java.lang.Class<?> wildcardClass4 = defaultParser0.getClass();
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.apache.commons.cli.Option option19 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options20, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(option19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options19, strArray25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = list9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.lang.String str16 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options17, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options21, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options14, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.String str11 = defaultParser0.currentToken;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        boolean boolean15 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options14, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        java.lang.String str15 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.skipParsing = false;
        boolean boolean14 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options11, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options6, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        boolean boolean18 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        defaultParser0.currentToken = "";
        java.lang.String str23 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        defaultParser0.currentToken = "";
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options7, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "" });
    }
}

