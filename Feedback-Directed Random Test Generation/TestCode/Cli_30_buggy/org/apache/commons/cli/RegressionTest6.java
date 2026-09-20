package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        boolean boolean11 = defaultParser0.skipParsing;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        boolean boolean19 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.apache.commons.cli.CommandLine commandLine19 = null;
        defaultParser0.cmd = commandLine19;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options12, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = null;
        defaultParser0.options = options19;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.skipParsing = false;
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        org.apache.commons.cli.Option option22 = null;
        defaultParser0.currentOption = option22;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options22, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        java.lang.String str17 = defaultParser0.currentToken;
        java.util.List list18 = defaultParser0.expectedOpts;
        boolean boolean19 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!", "" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options19, strArray24, properties25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options19, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "" });
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        java.lang.String str16 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options17, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.lang.String str9 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(options18);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = false;
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
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
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        java.lang.String str10 = defaultParser0.currentToken;
        java.lang.String str11 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.skipParsing;
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options16, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options20, strArray26, properties27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option16);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray13, properties14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        boolean boolean11 = defaultParser0.skipParsing;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.stopAtNonOption;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        java.lang.String str15 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options18, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.stopAtNonOption = true;
        java.util.List list17 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        boolean boolean20 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass21 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.cmd;
        org.apache.commons.cli.Option option21 = defaultParser0.currentOption;
        java.util.List list22 = null;
        defaultParser0.expectedOpts = list22;
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options24, strArray26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(commandLine20);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        boolean boolean11 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        java.lang.String str17 = defaultParser0.currentToken;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options19, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        boolean boolean18 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options21 = null;
        defaultParser0.options = options21;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        boolean boolean17 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options14, strArray21, properties22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "", "", "", "" });
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options18, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options4, strArray6, properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        defaultParser0.stopAtNonOption = false;
        java.util.List list17 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        java.util.List list20 = null;
        defaultParser0.expectedOpts = list20;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine32 = defaultParser0.parse(options24, strArray30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        java.util.List list16 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine12);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass5 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = defaultParser0.expectedOpts;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str15 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options18, strArray24, properties25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options22, strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        java.util.List list12 = defaultParser0.expectedOpts;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        boolean boolean7 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.lang.String str10 = defaultParser0.currentToken;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        java.util.List list13 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        boolean boolean20 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        defaultParser0.stopAtNonOption = false;
        java.util.List list23 = null;
        defaultParser0.expectedOpts = list23;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine7);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options21, strArray24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.currentToken = "";
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = false;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.stopAtNonOption = false;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str11 = defaultParser0.currentToken;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(option17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options22 = null;
        defaultParser0.options = options22;
        boolean boolean24 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(option18);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        java.lang.String str4 = defaultParser0.currentToken;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        boolean boolean14 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options18, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = true;
        boolean boolean24 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.cmd;
        java.util.List list26 = null;
        defaultParser0.expectedOpts = list26;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(commandLine25);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        java.util.List list21 = null;
        defaultParser0.expectedOpts = list21;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options23, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        java.util.List list14 = defaultParser0.expectedOpts;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.String str16 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        java.lang.String str12 = defaultParser0.currentToken;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.apache.commons.cli.Options options20 = null;
        defaultParser0.options = options20;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray16, properties17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str16 = defaultParser0.currentToken;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        boolean boolean18 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options20, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        boolean boolean15 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine11);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options14, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option5);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine22 = null;
        defaultParser0.cmd = commandLine22;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options18, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        java.util.List list10 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        java.util.List list14 = defaultParser0.expectedOpts;
        boolean boolean15 = defaultParser0.skipParsing;
        java.lang.String str16 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options19, strArray23, properties24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        boolean boolean11 = defaultParser0.stopAtNonOption;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.lang.Class<?> wildcardClass5 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        defaultParser0.stopAtNonOption = true;
        java.lang.Class<?> wildcardClass19 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.Option option15 = null;
        defaultParser0.currentOption = option15;
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options18, strArray25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "", "hi!", "" });
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "hi!" });
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        defaultParser0.currentToken = "hi!";
        java.util.List list11 = defaultParser0.expectedOpts;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        org.apache.commons.cli.Options options21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine30 = defaultParser0.parse(options21, strArray28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(option1);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str17 = defaultParser0.currentToken;
        java.util.List list18 = defaultParser0.expectedOpts;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options20, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = false;
        boolean boolean19 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options20 = null;
        defaultParser0.options = options20;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        defaultParser0.stopAtNonOption = true;
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        boolean boolean17 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options20, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = options10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options3 = defaultParser0.options;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options19, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = null;
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.cmd;
        org.apache.commons.cli.Options options22 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine23 = null;
        defaultParser0.cmd = commandLine23;
        org.apache.commons.cli.Options options25 = defaultParser0.options;
        org.apache.commons.cli.Options options26 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Properties properties30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine31 = defaultParser0.parse(options26, strArray29, properties30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNull(options22);
        org.junit.Assert.assertNull(options25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.util.List list12 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.Option option21 = null;
        defaultParser0.currentOption = option21;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        java.lang.String str14 = defaultParser0.currentToken;
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        boolean boolean13 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass21 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine19 = null;
        defaultParser0.cmd = commandLine19;
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options15, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option18 = null;
        defaultParser0.currentOption = option18;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        java.util.List list21 = null;
        defaultParser0.expectedOpts = list21;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(option20);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        defaultParser0.currentToken = "";
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = true;
        java.util.List list24 = null;
        defaultParser0.expectedOpts = list24;
        java.lang.Class<?> wildcardClass26 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = true;
        java.lang.String str12 = defaultParser0.currentToken;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        boolean boolean19 = defaultParser0.skipParsing;
        java.util.List list20 = defaultParser0.expectedOpts;
        boolean boolean21 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options9, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNull(options19);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        boolean boolean9 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(option15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options16, strArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.stopAtNonOption;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        org.apache.commons.cli.Options options20 = null;
        defaultParser0.options = options20;
        java.util.List list22 = null;
        defaultParser0.expectedOpts = list22;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str17 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = true;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(option20);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options20, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        java.lang.String str12 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options13, strArray20, properties21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        defaultParser0.skipParsing = true;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        java.lang.String str19 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine4);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.util.List list14 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        java.util.List list17 = defaultParser0.expectedOpts;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.lang.String str10 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options14, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        java.lang.String str7 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options14, strArray21, properties22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        boolean boolean17 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options18, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        boolean boolean12 = defaultParser0.skipParsing;
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        boolean boolean15 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option6);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean13 = defaultParser0.skipParsing;
        boolean boolean14 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options18, strArray22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        boolean boolean13 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine18 = null;
        defaultParser0.cmd = commandLine18;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str22 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        boolean boolean13 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str19 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        boolean boolean8 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.skipParsing = true;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = null;
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.cmd;
        org.apache.commons.cli.Option option6 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(commandLine5);
        org.junit.Assert.assertNull(option6);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.util.List list17 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options18, strArray21, properties22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list10 = defaultParser0.expectedOpts;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        java.lang.String str12 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean14 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        boolean boolean17 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        java.lang.String str13 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        java.lang.String str7 = defaultParser0.currentToken;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(options2);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        java.lang.String str9 = defaultParser0.currentToken;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str12 = defaultParser0.currentToken;
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        boolean boolean11 = defaultParser0.skipParsing;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option17 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(option17);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = defaultParser0.expectedOpts;
        boolean boolean12 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        boolean boolean13 = defaultParser0.skipParsing;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        boolean boolean16 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(options17);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "hi!";
        java.lang.String str22 = defaultParser0.currentToken;
        java.util.List list23 = null;
        defaultParser0.expectedOpts = list23;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str10 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(option11);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options6, strArray13, properties14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.skipParsing = false;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(commandLine16);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.cmd;
        org.apache.commons.cli.Options options22 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine23 = null;
        defaultParser0.cmd = commandLine23;
        org.apache.commons.cli.Options options25 = defaultParser0.options;
        org.apache.commons.cli.Options options26 = null;
        defaultParser0.options = options26;
        org.apache.commons.cli.Options options28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine33 = defaultParser0.parse(options28, strArray31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(commandLine21);
        org.junit.Assert.assertNull(options22);
        org.junit.Assert.assertNull(options25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options18, strArray24, properties25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(options16);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.skipParsing;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean13 = defaultParser0.skipParsing;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        boolean boolean13 = defaultParser0.skipParsing;
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = defaultParser0.options;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        boolean boolean20 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        boolean boolean23 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(options17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.cmd;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        boolean boolean18 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.util.List list16 = defaultParser0.expectedOpts;
        java.lang.String str17 = defaultParser0.currentToken;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        java.util.List list20 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(commandLine19);
        org.junit.Assert.assertNull(list20);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        defaultParser0.currentToken = "";
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.lang.String str10 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        defaultParser0.options = options12;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options14, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "";
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        boolean boolean13 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass14 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list4 = defaultParser0.expectedOpts;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNull(options19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        boolean boolean14 = defaultParser0.skipParsing;
        java.util.List list15 = null;
        defaultParser0.expectedOpts = list15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options17, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option15 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(option15);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.lang.String str9 = defaultParser0.currentToken;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options19, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        org.apache.commons.cli.Options options19 = null;
        defaultParser0.options = options19;
        org.apache.commons.cli.Option option21 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option21);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        boolean boolean8 = defaultParser0.skipParsing;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        defaultParser0.skipParsing = true;
        java.util.List list17 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option18 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(list17);
        org.junit.Assert.assertNull(option18);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option14);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options16, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options7, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        boolean boolean10 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.currentToken = "";
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        boolean boolean17 = defaultParser0.skipParsing;
        java.lang.String str18 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        java.lang.String str11 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.lang.String str5 = defaultParser0.currentToken;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        boolean boolean11 = defaultParser0.stopAtNonOption;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        boolean boolean10 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(options11);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list14 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = null;
        defaultParser0.options = options19;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option21 = defaultParser0.currentOption;
        java.util.List list22 = null;
        defaultParser0.expectedOpts = list22;
        org.apache.commons.cli.Options options24 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option21);
        org.junit.Assert.assertNull(options24);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = true;
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options17, strArray22, properties23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "" });
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = defaultParser0.options;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(options3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        boolean boolean15 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        boolean boolean15 = defaultParser0.skipParsing;
        java.util.List list16 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options18, strArray24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        boolean boolean13 = defaultParser0.skipParsing;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options17, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.cmd;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        java.util.List list18 = null;
        defaultParser0.expectedOpts = list18;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNull(commandLine17);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        boolean boolean11 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options15, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options17, strArray24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        java.lang.String str11 = defaultParser0.currentToken;
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        java.util.List list19 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNull(option20);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        java.util.List list15 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean15 = defaultParser0.skipParsing;
        boolean boolean16 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        java.util.List list19 = null;
        defaultParser0.expectedOpts = list19;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = null;
        defaultParser0.expectedOpts = list12;
        java.util.List list14 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = defaultParser0.options;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        defaultParser0.options = options17;
        boolean boolean19 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option20 = defaultParser0.currentOption;
        java.util.List list21 = null;
        defaultParser0.expectedOpts = list21;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine30 = defaultParser0.parse(options23, strArray28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(option20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.String str12 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = null;
        defaultParser0.cmd = commandLine14;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.apache.commons.cli.Option option14 = defaultParser0.currentOption;
        java.util.List list15 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNull(option14);
        org.junit.Assert.assertNull(list15);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        boolean boolean12 = defaultParser0.skipParsing;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.lang.String str10 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        boolean boolean11 = defaultParser0.skipParsing;
        java.util.List list12 = defaultParser0.expectedOpts;
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = defaultParser0.expectedOpts;
        java.lang.String str12 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(option12);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine16 = null;
        defaultParser0.cmd = commandLine16;
        org.apache.commons.cli.Options options18 = null;
        defaultParser0.options = options18;
        org.apache.commons.cli.Options options20 = null;
        defaultParser0.options = options20;
        boolean boolean22 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.Properties properties26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options23, strArray25, properties26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option19 = null;
        defaultParser0.currentOption = option19;
        org.apache.commons.cli.Option option21 = null;
        defaultParser0.currentOption = option21;
        org.apache.commons.cli.Options options23 = defaultParser0.options;
        org.apache.commons.cli.Options options24 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine33 = defaultParser0.parse(options24, strArray30, properties31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNull(options23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = defaultParser0.options;
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option21 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(options16);
        org.junit.Assert.assertNull(option21);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine3 = null;
        defaultParser0.cmd = commandLine3;
        org.apache.commons.cli.CommandLine commandLine5 = null;
        defaultParser0.cmd = commandLine5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.apache.commons.cli.Option option13 = null;
        defaultParser0.currentOption = option13;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Option option10 = null;
        defaultParser0.currentOption = option10;
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        java.lang.String str14 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        boolean boolean12 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine13 = null;
        defaultParser0.cmd = commandLine13;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        boolean boolean11 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        java.lang.String str14 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        java.lang.String str17 = defaultParser0.currentToken;
        java.util.List list18 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options19, strArray20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.junit.Assert.assertNull(commandLine13);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.cmd;
        boolean boolean14 = defaultParser0.skipParsing;
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        java.lang.String str10 = defaultParser0.currentToken;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option16 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine17 = null;
        defaultParser0.cmd = commandLine17;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options19, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = list11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.currentToken = "";
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        java.lang.String str11 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options12, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(option10);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = true;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options15, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.lang.String str6 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        boolean boolean14 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option20 = null;
        defaultParser0.currentOption = option20;
        org.apache.commons.cli.Option option22 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options23 = null;
        defaultParser0.options = options23;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(options15);
        org.junit.Assert.assertNull(option22);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.stopAtNonOption = true;
        boolean boolean14 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray16 = null;
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options15, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        defaultParser0.options = options6;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine9 = null;
        defaultParser0.cmd = commandLine9;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine15 = null;
        defaultParser0.cmd = commandLine15;
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.apache.commons.cli.Options options19 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.String str22 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNull(options19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        org.apache.commons.cli.Option option12 = null;
        defaultParser0.currentOption = option12;
        defaultParser0.currentToken = "hi!";
        java.lang.String str16 = defaultParser0.currentToken;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option16 = null;
        defaultParser0.currentOption = option16;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.currentToken = "hi!";
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options12, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" });
    }
}

