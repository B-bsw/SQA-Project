package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        defaultParser0.stopAtNonOption = true;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        java.lang.String str18 = defaultParser0.currentToken;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray20, properties21);
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
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        java.util.List list17 = defaultParser0.expectedOpts;
        boolean boolean18 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
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
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        java.lang.String str18 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options21 = null;
        defaultParser0.options = options21;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        defaultParser0.stopAtNonOption = true;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        java.lang.String str9 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        defaultParser0.currentToken = "hi!";
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options8, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options7, strArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "", "hi!", "" });
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list17 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.lang.String str3 = defaultParser0.currentToken;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
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
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options23, strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
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
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
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
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        java.util.List list17 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options18, strArray25, properties26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
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
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(options1);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        defaultParser0.currentToken = "";
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.skipParsing = false;
        java.util.List list14 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = list14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
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
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.lang.String str20 = defaultParser0.currentToken;
        boolean boolean21 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine22 = null;
        defaultParser0.cmd = commandLine22;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
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
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.junit.Assert.assertNull(list1);
    }
}

