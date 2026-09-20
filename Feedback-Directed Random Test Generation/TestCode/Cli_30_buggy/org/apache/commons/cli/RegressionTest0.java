package org.apache.commons.cli;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.parse(options2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray4 = null;
        java.util.Properties properties5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray4, properties5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.parse(options1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray10, properties11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray10, properties11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options3, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options2, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options6, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options4, strArray8, properties9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options3, strArray7, properties8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options4, strArray7, properties8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray8, properties9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options4, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options14, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options7, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options5, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options14, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options4, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options6, strArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options2, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = list12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str9 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass2 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options7, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options1, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options2, strArray6, properties7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options8, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options3, strArray10, properties11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options4, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options8, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options14, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options4, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        defaultParser0.stopAtNonOption = true;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options5, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options2, strArray3, properties4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options7, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options7, strArray11, properties12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
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
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options3, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass3 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options14, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray15, properties16, false);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = option8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options14, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
        java.util.List list10 = defaultParser0.expectedOpts;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = null;
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options17, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        java.lang.Class<?> wildcardClass3 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options11);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass6 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        java.util.List list9 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options5, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options18, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = null;
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray14, properties15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options6, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options4, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray11, properties12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "", "", "" });
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options3, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, properties20);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, false);
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
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options17, strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.util.List list12 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = list12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "" });
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options10, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        defaultParser0.currentToken = "";
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options6, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(commandLine10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.CommandLine commandLine1 = null;
        defaultParser0.cmd = commandLine1;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options3, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, true);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.String str15 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        defaultParser0.currentToken = "";
        java.util.List list8 = null;
        defaultParser0.expectedOpts = list8;
        org.junit.Assert.assertNull(option1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options19, strArray26, properties27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options5, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        java.lang.String str19 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        java.util.Properties properties27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser0.parse(options20, strArray26, properties27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options7, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNull(commandLine14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options4, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.apache.commons.cli.Option option12 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "", "hi!" });
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options16, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray10, properties11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options3, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.lang.String str13 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.cmd;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options8, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options6, strArray10, properties11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options14, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options18, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options5, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "", "", "" });
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options6, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass5 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str9 = defaultParser0.currentToken;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = list7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options14, strArray18, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray13, properties14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options11, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options12, strArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options5, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options4, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass10 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options5, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "hi!", "" });
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options5, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options16, strArray22, properties23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        java.lang.Class<?> wildcardClass4 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options3, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.util.List list12 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray12, properties13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option9 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options10, strArray13, properties14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options15 = null;
        defaultParser0.options = options15;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options17, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.Class<?> wildcardClass19 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.String str14 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass17 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        java.util.List list9 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options12, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options6, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options9, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        defaultParser0.options = options11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options16, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options16, strArray23, properties24, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "", "hi!", "", "" });
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!", "" };
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray13, properties14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.util.List list7 = defaultParser0.expectedOpts;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = list7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options16, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        defaultParser0.currentToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options5, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "", "hi!", "", "" });
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.Class<?> wildcardClass18 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options7, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options15, strArray18, properties19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray18);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = option5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.cmd;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(commandLine9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.util.List list14 = null;
        defaultParser0.expectedOpts = list14;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray16, properties17, false);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = null;
        defaultParser0.expectedOpts = list9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options16, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.String[] strArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options18, strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.currentToken = "";
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options5, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.apache.commons.cli.Option option11 = null;
        defaultParser0.currentOption = option11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Option option11 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray16, properties17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option13 = defaultParser0.currentOption;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.util.List list13 = null;
        defaultParser0.expectedOpts = list13;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options14, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(option13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray17, properties18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = null;
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray15, properties16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        defaultParser0.currentToken = "";
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options5, strArray8, properties9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(option2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.util.List list13 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "", "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options5, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "hi!", "", "" });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray20, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = options14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options9, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray19, false);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray22, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        defaultParser0.handleConcatenatedOptions("");
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.String str13 = defaultParser0.currentToken;
        java.lang.String str14 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = options6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        defaultParser0.options = options8;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options10, strArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        java.util.List list11 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options12, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(list11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options2, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options9, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        boolean boolean20 = defaultParser0.skipParsing;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = false;
        java.lang.String str9 = defaultParser0.currentToken;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        java.util.List list5 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine4);
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        java.lang.String str4 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        org.apache.commons.cli.Options options10 = defaultParser0.options;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(options10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options18, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        defaultParser0.currentToken = "";
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options14, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.apache.commons.cli.Option option17 = null;
        defaultParser0.currentOption = option17;
        java.lang.String str19 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser0.parse(options20, strArray24, properties25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options9, strArray16, properties17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "", "" });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options15, strArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options8, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.util.List list11 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option8 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option7);
        org.junit.Assert.assertNull(option8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.apache.commons.cli.Option option10 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        boolean boolean15 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options16, strArray18);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        java.util.List list7 = defaultParser0.expectedOpts;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options10, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine6 = null;
        defaultParser0.cmd = commandLine6;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options11, strArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options10, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.util.List list11 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options10, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options17, strArray21, properties22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray17, properties18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.Option option7 = null;
        defaultParser0.currentOption = option7;
        defaultParser0.currentToken = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.currentToken = "";
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options7, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.apache.commons.cli.Options options10 = null;
        defaultParser0.options = options10;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options9, strArray15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        boolean boolean15 = defaultParser0.skipParsing;
        java.util.List list16 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options17, strArray19, properties20, false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.currentToken = "hi!";
        java.lang.Class<?> wildcardClass9 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.cmd;
        org.apache.commons.cli.Options options18 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.cmd;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNull(commandLine17);
        org.junit.Assert.assertNull(options18);
        org.junit.Assert.assertNull(commandLine19);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine28 = defaultParser0.parse(options21, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options7, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(options9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options15, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        java.util.List list10 = null;
        defaultParser0.expectedOpts = list10;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options13, strArray16, false);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray21, properties22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        java.util.List list4 = defaultParser0.expectedOpts;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options11, strArray18, properties19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.handleConcatenatedOptions("");
        java.lang.String str8 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options9 = null;
        defaultParser0.options = options9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options8, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.apache.commons.cli.Options options12 = defaultParser0.options;
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        org.apache.commons.cli.Option option9 = null;
        defaultParser0.currentOption = option9;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray17, properties18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options12, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options12, strArray17, properties18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        boolean boolean12 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options13, strArray17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray19);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine8 = null;
        defaultParser0.cmd = commandLine8;
        java.util.List list10 = defaultParser0.expectedOpts;
        java.util.List list11 = null;
        defaultParser0.expectedOpts = list11;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.stopAtNonOption;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options6, strArray7, properties8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        java.util.List list7 = null;
        defaultParser0.expectedOpts = list7;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        org.apache.commons.cli.Options options14 = null;
        defaultParser0.options = options14;
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options16, strArray20, properties21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option10);
        org.junit.Assert.assertNull(commandLine13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray13, properties14, false);
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        java.util.List list9 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        boolean boolean15 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass16 = defaultParser0.getClass();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = null;
        defaultParser0.cmd = commandLine10;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.String str1 = defaultParser0.currentToken;
        java.util.List list2 = defaultParser0.expectedOpts;
        boolean boolean3 = defaultParser0.skipParsing;
        java.lang.String str4 = defaultParser0.currentToken;
        java.lang.Class<?> wildcardClass5 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options19, strArray22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.apache.commons.cli.Option option8 = null;
        defaultParser0.currentOption = option8;
        defaultParser0.stopAtNonOption = true;
        java.lang.Class<?> wildcardClass12 = defaultParser0.getClass();
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        java.lang.String str7 = defaultParser0.currentToken;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.util.List list2 = null;
        defaultParser0.expectedOpts = list2;
        defaultParser0.currentToken = "hi!";
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.skipParsing;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = defaultParser0.options;
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options13, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray18, properties19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options19, strArray23, false);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser0.parse(options16, strArray22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "", "hi!" });
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser0.parse(options11, strArray13);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        java.util.List list2 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options3, strArray6, properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser0.parse(options13, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray10, properties11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.stopAtNonOption;
        defaultParser0.skipParsing = false;
        java.lang.Class<?> wildcardClass6 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.Option option2 = null;
        defaultParser0.currentOption = option2;
        org.apache.commons.cli.Option option4 = null;
        defaultParser0.currentOption = option4;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options10, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine7 = null;
        defaultParser0.cmd = commandLine7;
        org.apache.commons.cli.Options options9 = defaultParser0.options;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(options9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser0.parse(options17, strArray23, properties24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options16, strArray23, properties24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        defaultParser0.currentToken = "";
        java.lang.Class<?> wildcardClass7 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        boolean boolean4 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options5 = null;
        defaultParser0.options = options5;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        java.lang.Class<?> wildcardClass8 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
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
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option4 = defaultParser0.currentOption;
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options5, strArray12, properties13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(option4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        boolean boolean8 = defaultParser0.stopAtNonOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser0.parse(options11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.currentToken = "hi!";
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Class<?> wildcardClass15 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(commandLine6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options12, strArray16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options13, strArray19, properties20);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Option option5 = null;
        defaultParser0.currentOption = option5;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        defaultParser0.currentToken = "";
        java.util.List list3 = null;
        defaultParser0.expectedOpts = list3;
        java.util.List list5 = null;
        defaultParser0.expectedOpts = list5;
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertNull(options13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        boolean boolean2 = defaultParser0.skipParsing;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        org.apache.commons.cli.Options options4 = null;
        defaultParser0.options = options4;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(commandLine3);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.apache.commons.cli.Options options14 = defaultParser0.options;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNull(option11);
        org.junit.Assert.assertNull(options14);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = options13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options18, strArray24, properties25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(commandLine12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser0.parse(options13, strArray19, properties20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser0.parse(options11, strArray16, properties17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        java.lang.Class<?> wildcardClass4 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.util.List list6 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        java.util.List list8 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options9, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser0.parse(options13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        boolean boolean17 = defaultParser0.stopAtNonOption;
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        java.util.Properties properties25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options17, strArray24, properties25);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "", "", "hi!", "" });
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(options12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        org.apache.commons.cli.Options options16 = null;
        defaultParser0.options = options16;
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options18, strArray24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(options10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options21 = null;
        defaultParser0.options = options21;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(commandLine18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.apache.commons.cli.Option option14 = null;
        defaultParser0.currentOption = option14;
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.handleConcatenatedOptions("");
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(options4);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options11, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(option9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        defaultParser0.handleConcatenatedOptions("");
        java.util.List list8 = defaultParser0.expectedOpts;
        boolean boolean9 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options10, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.apache.commons.cli.CommandLine commandLine11 = null;
        defaultParser0.cmd = commandLine11;
        defaultParser0.stopAtNonOption = true;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        org.apache.commons.cli.Option option3 = null;
        defaultParser0.currentOption = option3;
        java.util.List list5 = defaultParser0.expectedOpts;
        java.util.List list6 = null;
        defaultParser0.expectedOpts = list6;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser0.parse(options8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(commandLine2);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.Options options3 = null;
        defaultParser0.options = options3;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Option option6 = null;
        defaultParser0.currentOption = option6;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        boolean boolean8 = defaultParser0.stopAtNonOption;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(commandLine7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser0.parse(options8, strArray15, properties16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "", "" });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        defaultParser0.currentToken = "hi!";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.apache.commons.cli.Options options13 = null;
        defaultParser0.options = options13;
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
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        defaultParser0.currentToken = "";
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        defaultParser0.handleConcatenatedOptions("");
        org.apache.commons.cli.CommandLine commandLine12 = null;
        defaultParser0.cmd = commandLine12;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        boolean boolean11 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser0.parse(options12, strArray19, properties20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass13 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.util.List list1 = null;
        defaultParser0.expectedOpts = list1;
        org.apache.commons.cli.CommandLine commandLine3 = defaultParser0.cmd;
        defaultParser0.skipParsing = true;
        boolean boolean6 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options7 = null;
        defaultParser0.options = options7;
        defaultParser0.handleConcatenatedOptions("");
        defaultParser0.skipParsing = false;
        org.junit.Assert.assertNull(commandLine3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = null;
        defaultParser0.cmd = commandLine2;
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        boolean boolean6 = defaultParser0.skipParsing;
        defaultParser0.skipParsing = false;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.cmd;
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser0.parse(options12, strArray14, properties15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = null;
        defaultParser0.cmd = commandLine4;
        java.lang.String str6 = defaultParser0.currentToken;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser0.parse(options8, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.util.List list13 = defaultParser0.expectedOpts;
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser0.parse(options14, strArray21, properties22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getRequiredOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        java.util.List list8 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        java.lang.Class<?> wildcardClass11 = defaultParser0.getClass();
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(option5);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultParser0.handleConcatenatedOptions("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.hasOption(String)\" because \"this.options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.apache.commons.cli.Options options15 = defaultParser0.options;
        java.util.List list16 = null;
        defaultParser0.expectedOpts = list16;
        org.junit.Assert.assertNull(option1);
        org.junit.Assert.assertNull(list6);
        org.junit.Assert.assertNull(options7);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNull(options15);
    }
}

