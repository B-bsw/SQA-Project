package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        java.lang.String str12 = defaultParser0.currentToken;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = commandLine18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        java.lang.String str21 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options22, strArray26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        java.lang.String str19 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options12, strArray14, properties15);
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        java.lang.String str12 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options6, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(commandLine19);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        defaultParser0.currentToken = "hi!";
        java.lang.String str17 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, false);
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
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.lang.String str15 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNull(list19);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options16, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        defaultParser0.stopAtNonOption = true;
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.String str5 = defaultParser0.currentToken;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        boolean boolean6 = defaultParser0.skipParsing;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options6, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        boolean boolean18 = defaultParser0.stopAtNonOption;
        boolean boolean19 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        java.util.List list6 = defaultParser0.expectedOpts;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        boolean boolean6 = defaultParser0.skipParsing;
        boolean boolean7 = defaultParser0.skipParsing;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options8, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
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
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        defaultParser0.stopAtNonOption = false;
        java.lang.String str20 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        java.util.List list13 = defaultParser0.expectedOpts;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.apache.commons.cli.Options options19 = null;
        defaultParser0.options = options19;
        java.lang.String str21 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        boolean boolean13 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option20);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        defaultParser0.currentToken = "hi!";
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options24 = null;
        defaultParser0.options = options24;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.skipParsing;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.lang.String str15 = defaultParser0.currentToken;
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options16, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options19, strArray21, false);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        java.lang.String str15 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options19, strArray22, properties23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        defaultParser0.skipParsing = true;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        boolean boolean15 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray22);
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        java.util.List list3 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options8, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        defaultParser0.stopAtNonOption = true;
        boolean boolean14 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        defaultParser0.currentToken = "";
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        boolean boolean13 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option19 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNull(option19);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!", "", "" });
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "hi!";
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        java.util.List list19 = defaultParser0.expectedOpts;
        java.lang.String str20 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option23 = null;
        defaultParser0.currentOption = option23;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine22 = null;
        defaultParser0.cmd = commandLine22;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        java.util.List list16 = defaultParser0.expectedOpts;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options18, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.util.List list16 = defaultParser0.expectedOpts;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray13, properties14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        defaultParser0.currentToken = "";
        boolean boolean16 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        defaultParser0.options = options10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray22, properties23, true);
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
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options16, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.junit.Assert.assertNull(options1);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass4 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        defaultParser0.options = options10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        boolean boolean20 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine21 = null;
        defaultParser0.cmd = commandLine21;
        org.apache.commons.cli.Option option23 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(option23);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = list9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str17 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options20, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.lang.String str3 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        boolean boolean14 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        boolean boolean16 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.util.List list16 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options17, strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray20, properties21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "hi!";
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options7, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        boolean boolean3 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        java.lang.String str13 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(options15);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str11 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list17 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        java.lang.String str14 = defaultParser0.currentToken;
        java.lang.String str15 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        java.lang.String str19 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        boolean boolean3 = defaultParser0.skipParsing;
        boolean boolean4 = defaultParser0.skipParsing;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "", "" });
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = false;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options16, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        defaultParser0.currentToken = "hi!";
        java.lang.String str19 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options20, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options19, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
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
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray16, properties17, false);
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
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        java.lang.Class<?> wildcardClass17 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.currentToken = "hi!";
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine20 = null;
        defaultParser0.cmd = commandLine20;
        org.junit.Assert.assertNull(list19);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        boolean boolean19 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option21 = defaultParser0.currentOption;
        boolean boolean22 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(option20);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        defaultParser0.currentToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options10, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "", "hi!" });
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.lang.Class<?> wildcardClass3 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        defaultParser0.stopAtNonOption = false;
        boolean boolean15 = defaultParser0.skipParsing;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray20);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        boolean boolean18 = defaultParser0.skipParsing;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        java.util.List list21 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(list21);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.lang.String str3 = defaultParser0.currentToken;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
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
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options17, strArray18, true);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
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
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        boolean boolean9 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.CommandLine commandLine19 = null;
        defaultParser0.cmd = commandLine19;
        defaultParser0.stopAtNonOption = true;
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
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine20 = null;
        defaultParser0.cmd = commandLine20;
        java.util.List list22 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(list22);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options22, strArray25, false);
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
        org.junit.Assert.assertNull(options19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options20, strArray21, properties22);
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
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options20, strArray24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        java.lang.String str16 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        boolean boolean19 = defaultParser0.skipParsing;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        boolean boolean21 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "hi!", "", "" };
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "hi!", "", "" });
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options20, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        boolean boolean13 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        org.apache.commons.cli.Options options20 = null;
        defaultParser0.options = options20;
        org.apache.commons.cli.Options options22 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(options22);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options19, strArray22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        java.lang.Class<?> wildcardClass21 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        defaultParser0.options = options19;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        defaultParser0.skipParsing = true;
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.cmd;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine31 = defaultParser0.parse(options23, strArray28, properties29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(commandLine22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = list12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        defaultParser0.stopAtNonOption = false;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options19, strArray20, properties21);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        boolean boolean11 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str11 = defaultParser0.currentToken;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        java.lang.String str11 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(options18);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        defaultParser0.stopAtNonOption = false;
        java.util.List list22 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list22);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
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
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        java.util.List list15 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        java.lang.String str14 = defaultParser0.currentToken;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray22, properties23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
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
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        defaultParser0.currentToken = "";
        java.lang.String str14 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        java.util.List list17 = null;
        defaultParser0.expectedOpts = list17;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.String str5 = defaultParser0.currentToken;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        defaultParser0.stopAtNonOption = false;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
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
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.skipParsing;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str15 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.lang.String str9 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
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
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
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
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        java.lang.String str22 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine23 = null;
        defaultParser0.cmd = commandLine23;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        java.lang.String str18 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options21, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
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
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options14, strArray21, properties22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean7 = defaultParser0.stopAtNonOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = null;
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options18, strArray24, false);
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
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, properties19);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        boolean boolean7 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        defaultParser0.stopAtNonOption = true;
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(commandLine5);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine21 = null;
        defaultParser0.cmd = commandLine21;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        boolean boolean13 = defaultParser0.stopAtNonOption;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options14, strArray20, properties21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
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
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        java.lang.String str21 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine31 = defaultParser0.parse(options22, strArray29, properties30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
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
        defaultParser0.currentToken = "hi!";
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options18, strArray21, properties22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
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
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
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
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        java.lang.String str3 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        boolean boolean14 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
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
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        defaultParser0.options = options2;
        defaultParser0.skipParsing = false;
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = defaultParser0.options;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options1);
        org.junit.Assert.assertNull(options8);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        defaultParser0.stopAtNonOption = true;
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        defaultParser0.stopAtNonOption = true;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        boolean boolean18 = defaultParser0.skipParsing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option4);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = true;
        java.util.List list10 = defaultParser0.expectedOpts;
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        java.lang.String str21 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option22 = defaultParser0.currentOption;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(option22);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray16, false);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        boolean boolean2 = defaultParser0.skipParsing;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.skipParsing = false;
        boolean boolean14 = defaultParser0.skipParsing;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options16, strArray20, properties21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        java.lang.String str3 = defaultParser0.currentToken;
        java.util.List list4 = null;
        defaultParser0.expectedOpts = list4;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
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
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean4 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.util.List list12 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        java.lang.String str4 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        defaultParser0.options = options1;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        boolean boolean5 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray9, properties10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(commandLine15);
    }
}

