package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass5 = optionArray4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        java.util.List list19 = commandLine0.getArgList();
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str23 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        boolean boolean20 = commandLine0.hasOption("");
        boolean boolean22 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str17 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.List list10 = commandLine0.getArgList();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str8 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.util.List list14 = commandLine0.getArgList();
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        boolean boolean15 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String str17 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str5 = commandLine0.getOptionValue("", "");
        boolean boolean7 = commandLine0.hasOption(' ');
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass11 = optionArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass7 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        boolean boolean11 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.util.List list5 = commandLine0.getArgList();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        java.lang.Object obj22 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String str18 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("", "hi!");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("");
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue(' ', "");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        boolean boolean17 = commandLine0.hasOption('#');
        java.util.List list18 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        boolean boolean11 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        boolean boolean11 = commandLine0.hasOption("");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.util.List list8 = commandLine0.getArgList();
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue('a');
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        boolean boolean16 = commandLine0.hasOption("");
        java.lang.String str19 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.String str20 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str23 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        boolean boolean20 = commandLine0.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        commandLine0.addArg("");
        commandLine0.addArg("");
        java.lang.String str20 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator21 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass20 = list19.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.String str8 = commandLine0.getOptionValue("hi!", "");
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue('a', "");
        java.lang.String str21 = commandLine0.getOptionValue('#');
        java.lang.Object obj23 = commandLine0.getOptionObject('#');
        java.lang.String str26 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray27 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(optionArray27);
        org.junit.Assert.assertArrayEquals(optionArray27, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str9 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "");
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption('a');
        java.util.Iterator iterator10 = commandLine0.iterator();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject("");
        java.lang.String str9 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strArray13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        boolean boolean11 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('#');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue('#');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        boolean boolean12 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj22 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("");
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.util.Iterator iterator22 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str5 = commandLine0.getOptionValue("", "");
        boolean boolean7 = commandLine0.hasOption(' ');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.Iterator iterator9 = commandLine0.iterator();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("");
        java.lang.Class<?> wildcardClass8 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        java.util.List list14 = commandLine0.getArgList();
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.Object obj3 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption('a');
        boolean boolean11 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass13 = optionArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        boolean boolean16 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('4');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        boolean boolean16 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String str7 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String str17 = commandLine0.getOptionValue('4', "");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.lang.String str23 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        boolean boolean21 = commandLine0.hasOption("");
        java.lang.String str24 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray25 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(optionArray25);
        org.junit.Assert.assertArrayEquals(optionArray25, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('4');
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue('4', "");
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass8 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        java.lang.String str26 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass11 = optionArray10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass8 = iterator7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.util.List list10 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "");
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.util.Iterator iterator22 = commandLine0.iterator();
        java.lang.String str24 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option25 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String str17 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        boolean boolean20 = commandLine0.hasOption(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray20 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        boolean boolean24 = commandLine0.hasOption('#');
        java.lang.String str26 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass5 = optionArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray21 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Object obj18 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('4');
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.apache.commons.cli.Option option22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        boolean boolean20 = commandLine0.hasOption("");
        java.lang.String str23 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        boolean boolean23 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass6 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass7 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption('#');
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('#');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String[] strArray20 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.List list10 = commandLine0.getArgList();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.List list11 = commandLine0.getArgList();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.Object obj6 = commandLine0.getOptionObject('a');
        boolean boolean8 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str6 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray23 = commandLine0.getArgs();
        java.lang.Object obj25 = commandLine0.getOptionObject('a');
        java.lang.Object obj27 = commandLine0.getOptionObject(' ');
        boolean boolean29 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        java.lang.String str21 = commandLine0.getOptionValue('4');
        java.lang.Object obj23 = commandLine0.getOptionObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String[] strArray21 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        java.lang.Object obj25 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('a');
        java.util.List list6 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strArray17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('#');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray23 = commandLine0.getArgs();
        java.lang.String str26 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option option27 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass12 = optionArray11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        java.lang.String str10 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option option10 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator18 = commandLine0.iterator();
        commandLine0.addArg("");
        java.util.Iterator iterator21 = commandLine0.iterator();
        boolean boolean23 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean20 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String str12 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray21 = commandLine0.getArgs();
        boolean boolean23 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass7 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        boolean boolean9 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        boolean boolean20 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        boolean boolean21 = commandLine0.hasOption("");
        java.lang.String str24 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option option25 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("");
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String str21 = commandLine0.getOptionValue("", "");
        java.lang.Object obj23 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = strArray14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        org.apache.commons.cli.Option option3 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String[] strArray21 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator22 = commandLine0.iterator();
        java.lang.String str25 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues(' ');
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        boolean boolean17 = commandLine0.hasOption("");
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        boolean boolean19 = commandLine0.hasOption("");
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("");
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = strArray18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        boolean boolean11 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('4');
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        boolean boolean16 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        boolean boolean13 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str22 = commandLine0.getOptionValue("");
        java.lang.String[] strArray24 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        boolean boolean11 = commandLine0.hasOption(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Object obj18 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('4');
        boolean boolean22 = commandLine0.hasOption('a');
        java.lang.String[] strArray24 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption(' ');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        java.lang.String str15 = commandLine0.getOptionValue('4', "hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.String str13 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String str7 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        boolean boolean12 = commandLine0.hasOption('a');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        boolean boolean11 = commandLine0.hasOption('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.util.List list9 = commandLine0.getArgList();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String str17 = commandLine0.getOptionValue('a');
        boolean boolean19 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.util.List list7 = commandLine0.getArgList();
        java.util.List list8 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        boolean boolean14 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('4');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option option5 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        boolean boolean12 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        boolean boolean9 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray5 = commandLine0.getArgs();
        boolean boolean7 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.util.List list7 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        commandLine0.addArg("");
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj22 = commandLine0.getOptionObject(' ');
        java.lang.String str24 = commandLine0.getOptionValue('#');
        java.lang.Object obj26 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        boolean boolean14 = commandLine0.hasOption('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.lang.String str21 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.util.List list19 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
        java.lang.String str25 = commandLine0.getOptionValue('a');
        java.util.List list26 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = strArray18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.Object obj4 = commandLine0.getOptionObject("hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.util.List list8 = commandLine0.getArgList();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass7 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption('#');
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.lang.String str22 = commandLine0.getOptionValue('a');
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        boolean boolean19 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "");
        boolean boolean19 = commandLine0.hasOption("");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = strArray21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String[] strArray22 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        boolean boolean16 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.util.List list13 = commandLine0.getArgList();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue('a', "");
        java.lang.String str21 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('4');
        java.lang.String str25 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str22 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.lang.String str23 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        boolean boolean14 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        boolean boolean13 = commandLine0.hasOption('a');
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        java.lang.String str21 = commandLine0.getOptionValue('4');
        boolean boolean23 = commandLine0.hasOption('a');
        java.lang.Object obj25 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray26 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.Iterator iterator13 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass7 = commandLine0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj22 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option option23 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.util.List list16 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue(' ', "");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.String str24 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj21 = commandLine0.getOptionObject('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = obj21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        boolean boolean12 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        boolean boolean15 = commandLine0.hasOption('4');
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option option17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        boolean boolean18 = commandLine0.hasOption(' ');
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Object obj19 = commandLine0.getOptionObject('4');
        java.lang.String str21 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("");
        boolean boolean17 = commandLine0.hasOption("");
        boolean boolean19 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        java.lang.String str18 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String str11 = commandLine0.getOptionValue('#');
        boolean boolean13 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        boolean boolean17 = commandLine0.hasOption(' ');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.lang.String str25 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option option26 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String str22 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue('#');
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String str12 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj23 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        boolean boolean19 = commandLine0.hasOption('4');
        java.lang.String str21 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.Class<?> wildcardClass9 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.util.List list6 = commandLine0.getArgList();
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('4', "hi!");
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getArgs();
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        boolean boolean19 = commandLine0.hasOption(' ');
        java.lang.String str21 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
    }
}

